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

        int N = 0;
        String input;
        String last = "";
        ArrayList<String> Al = new ArrayList<String>();

        while((input = bf.readLine()) != null && !input.isEmpty()) {
            Al.add(input);
            N += 1;
            if (hashMap.get(input) == null) {
                hashMap.put(input, 1);
            } else  {
                hashMap.put(input, hashMap.get(input) + 1);
            }
        }

        Collections.sort(Al);

        for (String s : Al) {
            if (last.equals(s)) continue;
            else last = s;
            double out = ((double) (hashMap.get(s) * 100)) / N;
            sb.append(s).append(" ").append(String.format("%.4f", out)).append("\n");
        }
        System.out.println(sb);
    }
}
