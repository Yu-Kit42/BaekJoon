import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(bf.readLine());
        long out = 0L;
        if (N <= 2) out = N;
        else if (N == 3 ) out = 2L;
        else if (N <= 6) out = 3L;
        else if (N <= 10) out = 4L;
        else if (N <= 15) out = 5L;
        else if (N % 7 != 0) out = N / 7 + 4;
        else out = N / 7 + 3;
        System.out.println(out);
//        for (long i = out; i != out - 7; i--)
//            System.out.print(i + " ");
    }
}
