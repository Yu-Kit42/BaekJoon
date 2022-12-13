import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] in = bf.readLine().split(" ");

        int N = Integer.parseInt(in[0]);
        int M = Integer.parseInt(in[1]);

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            String tp = bf.readLine();
            hashMap.put(tp, i + 1);
            arr[i] = tp;
        }
        for (int i = 1; i <= M; i++) {
            String tp = bf.readLine();
            if (tp.charAt(0) <= 57) {
                sb.append(arr[Integer.parseInt(tp) - 1]);
            } else {
                sb.append(hashMap.get(tp));
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}
