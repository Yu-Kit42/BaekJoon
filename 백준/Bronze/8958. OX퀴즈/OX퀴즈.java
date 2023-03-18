import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            String tp = bf.readLine();
            int sc = 0;
            int sum = 0;

            for (int j = 0; j < tp.length(); j++) {
                if (tp.charAt(j) == 'O') sum += ++sc;
                else sc = 0;
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
