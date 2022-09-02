import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int N[] = new int[input];

        for (int i = 0; i < input; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b && a == c && b == c)
                N[i] = 10000 + a * 1000;
            else if (a == b || a == c)
                N[i] = 1000 + a * 100;
            else if (b == c)
                N[i] = 1000 + b * 100;
            else {
                int max = Math.max(a, Math.max(b, c));
                N[i] = max * 100;
            }
        }
        sc.close();
        Arrays.sort(N);
        System.out.print(N[N.length - 1] + " ");
    }
}

