import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<Integer, String> number = new HashMap<>();

        String[] tpArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < tpArr.length; i++) number.put(i, tpArr[i]);

        HashMap<String, Integer> out = new HashMap<>();

        for (int i = M; i <= N; i++) {
            String tp = "";
            if (i >= 10) tp += number.get(i / 10);
            tp += number.get(i % 10);
//            System.out.println(tp);
            out.put(tp, i);
            arrayList.add(tp);
        }

        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            if (i % 10 == 0 && i != 0) System.out.println();
            System.out.print(out.get(arrayList.get(i)) + " ");
        }
    }
}