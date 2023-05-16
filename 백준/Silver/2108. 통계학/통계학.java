import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[N];
        int[] cnt = new int[8001];

        int maxCnt = 0;
        double sum = 0;
        int max = -5000;
        int min = 5000;


        for (int i = 0; i < N; i++) {
            int tp = Integer.parseInt(bf.readLine());
            arr[i] = tp;

            sum += tp;
            if (cnt[maxCnt] < ++cnt[tp + 4000]) {
                maxCnt = tp + 4000;
            }
            max = Math.max(max, tp);
            min = Math.min(min, tp);

        }
        Arrays.sort(arr);
        ArrayList<Integer> tp = new ArrayList<>();

        for (int i = 0; i < 8001; i++) if (cnt[i] == cnt[maxCnt]) tp.add(i);
        Collections.sort(tp);

        int out = 0;
        if (tp.size() == 1) {
            out = tp.get(0);
        } else {
            out = tp.get(1) ;
        }


        System.out.println(Math.round(sum / (double) N));
        System.out.println(arr[arr.length / 2]);
        System.out.println(out - 4000);
        System.out.println(max - min);


    }
}