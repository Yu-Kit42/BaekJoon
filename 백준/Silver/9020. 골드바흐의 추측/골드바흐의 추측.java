import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] a = new boolean[10001];
        int N = Integer.parseInt(bf.readLine());
        int[] in = new int[N];

        for (int i = 0; i < N; i++)
            in[i] = Integer.parseInt(bf.readLine());

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int min = 0;
        int temp = 0;

        for (int i = 2; i <= 10000; i++) {
            if (a[i]) continue;
            for (int k = 2 * i; k <= 10000; k += i) a[k] = true;
            arr.add(i);
        }

        for (int index = 0; index < N; index++) {
            min = 100000;
            ArrayList<Integer> tpa = new ArrayList<Integer>();
            ArrayList<String> tpstr = new ArrayList<String>();

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) - 2 > in[index]) break;

                for (int k = 0; k < arr.size(); k++) {
                    temp = arr.get(i) + arr.get(k);
//                    System.out.printf("%d %d %d\n", i, k, temp);
                    if (temp > in[index]) break;
                    if (temp == in[index]) {
                        tpstr.add(arr.get(i) + " " + arr.get(k) + "\n");
                        tpa.add(Math.abs(arr.get(i) - arr.get(k)));
                        break;
                    }
                }
            }

            for (Integer integer : tpa) min = Math.min(min, integer);

            sb.append(tpstr.get(tpa.indexOf(min)));
        }
        System.out.println(sb);
    }
}
