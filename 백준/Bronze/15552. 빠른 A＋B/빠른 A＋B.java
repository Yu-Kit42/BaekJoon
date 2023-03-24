import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer("asdasd");
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < N; i++){
            st = new StringTokenizer(bf.readLine());
            int p1 = Integer.parseInt(st.nextToken());
            int p2 = Integer.parseInt(st.nextToken());
            sb.append(p1 + p2).append("\n");
        }

        System.out.println(sb);
    }
}
