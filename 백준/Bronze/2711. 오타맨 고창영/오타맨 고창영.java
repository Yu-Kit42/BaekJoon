import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        String[] in = new String[2];

        for (int i = 0; i < N; i++){
            in = bf.readLine().split(" ");
            sb.append(in[1]);
            sb.deleteCharAt(Integer.parseInt(in[0]) - 1);
            System.out.println(sb);
            sb.delete(0, sb.length());
        }
    }
}
