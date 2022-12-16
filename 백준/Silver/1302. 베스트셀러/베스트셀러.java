import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int max = 0;
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] arr = new String[N];
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String tp = bf.readLine();
            arr[i] = tp;
            int get = hashMap.getOrDefault(tp, 0);
            hashMap.put(tp, get + 1);
            if (get + 1 > max) max = get + 1;
        }

        for (int i = 0; i < N; i++) {
            if (hashMap.get(arr[i]) == max) list.add(arr[i]);
        }
        Collections.sort(list);

        System.out.println(list.get(0));
    }
}

