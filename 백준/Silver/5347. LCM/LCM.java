import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long gcd(long num1, long num2) {
        if (num2 == 0) return  num1;
        else return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for (int i = 0; i < N; i++) {
            String in = bf.readLine();
            int num1 = Integer.parseInt(in.split(" ")[0]);
            int num2 = Integer.parseInt(in.split(" ")[1]);
            long gcd = gcd(num1, num2);
            System.out.println((long) num1 * num2 / gcd);
        }
    }
}