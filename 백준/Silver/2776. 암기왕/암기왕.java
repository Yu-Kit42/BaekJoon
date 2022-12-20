import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int k = 0; k < N; k++) {

            int K = Integer.parseInt(bf.readLine());
            StringTokenizer st = new StringTokenizer(bf.readLine());

            for (int i = 0; i < K; i++) {
                hashMap.put(Integer.valueOf(st.nextToken()), true);
            }

            int in = Integer.parseInt(bf.readLine());
            st = new StringTokenizer(bf.readLine());

            for (int i = 0; i < in; i++) {
                if (hashMap.getOrDefault(Integer.valueOf(st.nextToken()), false)) sb.append(1);
                else  sb.append(0);
                sb.append("\n");
            }
            hashMap = new HashMap<>();
        }
        System.out.println(sb);
    }
}
