import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] tp = bf.readLine().split(" ");

        long i1 = Long.parseLong(tp[0]);
        long i2 = Long.parseLong(tp[1]);

        long out = Euclidean(i1, i2);

        System.out.println((i1 * i2 / out));


    }

    static long Euclidean(long a, long b) {
        long r = a % b;
//        System.out.printf("%d = %d %d \n", r, a, b);
        if (r == 0) {
            return b;
        }
        return Euclidean(b, r);


    }
}