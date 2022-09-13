import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] a = new boolean[1000001];
        a[0] = true;
        a[1] = true;

        for (int i = 2; i * i <= 1000000; i++) {
            if (a[i]) continue;
            for (int k = i * i; k <= 1000000; k += i) a[k] = true;
        }

        int N = 1;

        while (true) {

            N = Integer.parseInt(bf.readLine());
            if (N == 0) break;

            for (int i = 1; i <= N / 2; i++) {
                int A = i;
                int B = N - i;
                if(!a[A] && !a[B]) {
                    sb.append(N + " = " + A + " + " + B + "\n");
                    break;
                }
            }

        }
        System.out.println(sb);
    }
}
