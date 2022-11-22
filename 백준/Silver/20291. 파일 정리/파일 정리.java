import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());
        String last = "";
        ArrayList<String> Al = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            String[] tp = bf.readLine().split("\\.");
            Al.add(tp[1]);
            hashMap.put(tp[1], hashMap.getOrDefault(tp[1], 0) + 1);
        }
        Collections.sort(Al);

        for (String s : Al) {
            if (last.equals(s)) continue;
            else last = s;
            sb.append(s).append(" ").append(hashMap.get(s)).append("\n");
        }
        System.out.println(sb);
    }
}
