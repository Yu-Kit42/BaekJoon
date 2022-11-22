import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        StringBuilder sb = new StringBuilder();

        String[] arr = bf.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            if (hashMap.get(arr[i]) == null) {
                hashMap.put(arr[i], 1);
            } else  {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
        }

        N = Integer.parseInt(bf.readLine());
        arr = bf.readLine().split(" ");


        for (int i = 0; i < N; i++) {
            if (hashMap.get(arr[i]) == null)
                sb.append("0");
            else
                sb.append("1");
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
