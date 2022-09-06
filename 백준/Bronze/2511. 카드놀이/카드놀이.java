import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] fir = bf.readLine().split(" ");
        String[] sec = bf.readLine().split(" ");
        int A = 0;
        int B = 0;
        int tp1 = 0;
        int tp2 = 0;
        char last = 'A';

        for (int i = 0; i < fir.length; i++) {
            tp1 = Integer.parseInt(fir[i]);
            tp2 = Integer.parseInt(sec[i]);
            if (tp1 == tp2) {
                A++;
                B++;
            } else if (tp1 > tp2) {
                A += 3;
                last = 'A';
            } else {
                B += 3;
                last = 'B';
            }
        }

        if (A > B)
            System.out.printf("%d %d\n%s", A, B, "A");
        else if (A < B)
            System.out.printf("%d %d\n%s", A, B, "B");
        else if (A == B && A == 10)
            System.out.printf("%d %d\n%s", A, B, "D");
        else
            System.out.printf("%d %d\n%c", A, B, last);
    }
}
