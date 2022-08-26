import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int point = -1;
        int[] stack = new int[N];
        int in = 0;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            in = Integer.parseInt(bf.readLine());
            if (in != 0) {
                stack[++point] = in;
                sum += in;
            } else {
                sum -= stack[point];
                stack[point--] = 0;
            }
        }
        System.out.println(sum);

    }
}
