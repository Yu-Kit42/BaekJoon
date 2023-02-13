import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] stack = new int[100001];
        StringBuilder sb = new StringBuilder();

        int idx = -1;
        int in = 0;
        int i = 0;

        while (true) {
            in = Integer.parseInt(bf.readLine());

            while (i < in) {
                stack[++idx] = ++i;
                sb.append("+").append("\n");
            }
            if (stack[idx] == in) {
                stack[idx] = 0;
                idx--;
                sb.append("-").append("\n");
            } else {
                System.out.println("NO");
                System.exit(0);
            }
            if (idx == -1 && i >= N) break;
        }
        System.out.println(sb);
    }
}

