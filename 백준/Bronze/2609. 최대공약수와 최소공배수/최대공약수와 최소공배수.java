import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String in = bf.readLine();
        int num1 = Integer.parseInt(in.split(" ")[0]);
        int num2 = Integer.parseInt(in.split(" ")[1]);
        int gcd = gcd(num1, num2);

        System.out.println(gcd);
        System.out.println(num1 * num2 / gcd);

    }
}