import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] in = new String[10];
        int[] out = new int[10];
        int idx = 0;

        for (int i = 0; i < N; i++){
            in = bf.readLine().split(" ");
            idx = 0;
            for (String k : in) {
                out[idx] = Integer.parseInt(k);
                idx++;
            }
            Arrays.sort(out);
            System.out.println(out[7]);
        }
    }
}
