import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");;
        int N = Integer.parseInt(arr[0]);
        int out = Integer.parseInt(arr[1]);

        HashMap<String, String> hashMap = new HashMap<String, String>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr = bf.readLine().split(" ");
            hashMap.put(arr[0], arr[1]);
        }

        for (int i = 0; i < out; i++) {
            sb.append(hashMap.get(bf.readLine())).append("\n");
        }

        System.out.println(sb);
    }
}
