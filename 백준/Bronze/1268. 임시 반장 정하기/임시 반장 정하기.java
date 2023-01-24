import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][5];
        int idx = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            String[] tp = bf.readLine().split(" ");
            for (int k = 0; k < 5; k++) {
                arr[i][k] = Integer.parseInt(tp[k]);
            }
        }
        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
//                        System.out.println(i + ":" + k + " " + j + ":" + k);
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                idx = i;
            }
        }
        System.out.println(idx + 1);
    }
}


