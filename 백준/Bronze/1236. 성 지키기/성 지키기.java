import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int ve = Integer.parseInt(st.nextToken());
        int ho = Integer.parseInt(st.nextToken());

        boolean[] isVe = new boolean[ve];
        boolean[] isHo = new boolean[ho];

        for (int i = 0; i < ve; i++) {
            String tp = bf.readLine();
            for (int j = 0; j < ho; j++) {
                if (tp.charAt(j) == 'X') {
                    isVe[i] = true;
                    isHo[j] = true;
                }
            }
        }

        int countVe = 0;
        int countHo = 0;

        for (int i = 0; i < ve; i++) {
            if (!isVe[i]) countVe += 1;
        }

        for (int i = 0; i < ho; i++) {
            if (!isHo[i]) countHo += 1;
        }

        System.out.println(Math.max(countVe, countHo));
    }
}
