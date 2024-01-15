import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*

1. 가장 큰 수를 구하는게 목표
2. 각 요소를 더한 값을 배열에 기록하면서 탐색
   무조건 더 큰값을 배열에 기록하면 결국 큰값이 남지 않을까?
   만약 음수여도 더 큰값을 기록하니 -5 < -1 이 성립된다
   3 4 -3 -3 7 -> 8!
   3, 7, 4, 1, 8

 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] dp = new int[N + 1];

        String[] strInputArr = bf.readLine().split(" ");

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(strInputArr[i]);
            if (i == 0) {
                dp[i] = n;
                max = dp[i];
            } else {
//                System.out.println(dp[i - 1] + n + " " + n);
                dp[i] = Math.max(dp[i - 1] + n, n);
                max = Math.max(dp[i], max);
            }
        }
        System.out.println(max);
    }
}
