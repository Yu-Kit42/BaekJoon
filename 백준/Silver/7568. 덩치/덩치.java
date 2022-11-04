import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] x = new int[N];
        int[] y = new int[N];
        int[] rank = new int[N];
        int tpRank = 1;


        for (int i = 0; i < N; i++) {
            String[] tp = bf.readLine().split(" ");
            x[i] = Integer.parseInt(tp[0]);
            y[i] = Integer.parseInt(tp[1]);
        }

        for (int i = 0; i < N; i++) {
            tpRank = 1;
            for (int k = 0; k < N; k++){
                if (x[i] < x[k] && y[i] < y[k]) tpRank++;
            }
            rank[i] = tpRank;
        }

        for (int i : rank) {
            System.out.print(i + " ");
        }

    }
}
