

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);
        String[] tp1 = bf.readLine().split(" ");
        String[] tp2 = bf.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        int p1 = 0;
        int p2 = 0;
        int P1 = 0;
        int P2 = 0;
        for (int i = 0; i < N + M; i++) {
            if (p1 != tp1.length) P1 = Integer.parseInt(tp1[p1]);
            else P1 = Integer.MAX_VALUE;
            if (p2 != tp2.length) P2 = Integer.parseInt(tp2[p2]);
            else P2 = Integer.MAX_VALUE;

            if (P1 < P2) {
                sb.append(tp1[p1]).append(" ");
                p1++;
            } else {
                sb.append(tp2[p2]).append(" ");
                p2++;
            }
        }
        System.out.println(sb);
    }
}

