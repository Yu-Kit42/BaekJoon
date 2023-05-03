import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for (int i = 1; i <= N; i++) arr[i - 1] = i;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());


            for (int j = 0; j < (p2 - p1) / 2 + 1; j++) {
                int tp = arr[p1 + j - 1];
                arr[p1 + j - 1] = arr[p2 - j - 1];
                arr[p2 - j - 1] = tp;

            }
        }

        for (int i : arr) System.out.print(i + " ");


    }
}
