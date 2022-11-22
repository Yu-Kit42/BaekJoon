import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");
        int N1 = Integer.parseInt(arr[0]);
        int N2 = Integer.parseInt(arr[1]);
        int N = N1 + N2;

        arr = new String[N];

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < N; i++) {
            arr[i] = bf.readLine();
            if (hashMap.get(arr[i]) == null) {
                hashMap.put(arr[i], 1);
            } else {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
        }

        ArrayList<String> Al = new ArrayList<String>();


        if (N1 > N2) {
            for (int i = 0; i < N1; i++) {
                if (hashMap.get(arr[i]) == 2) {
                    Al.add(arr[i]);
                }
            }
        } else {
            for (int i = N1; i < N; i++) {
                if (hashMap.get(arr[i]) == 2) {
                    Al.add(arr[i]);
                }
            }
        }

        Collections.sort(Al);

        System.out.println(Al.size());
        for (String s : Al) System.out.print(s + "\n");


    }
}
