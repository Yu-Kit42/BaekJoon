import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = N - 1;

        int ans1 = 0;
        int ans2 = 0;

        while (start < end) {
            int sum = Math.abs(arr[start] + arr[end]);
//            System.out.printf("%d, %d, %d, %d\n", arr[start], arr[end] ,min, sum);
            if (min > sum){
                ans1 = arr[start];
                ans2 = arr[end];
                min = sum;

                if (min == 0) break;
            }
            if (arr[start] + arr[end] > 0) end--;
            else start++;
        }

        System.out.println(ans1 + " " + ans2);
    }
}

/*
5
-98 -97 1 2 92


 */