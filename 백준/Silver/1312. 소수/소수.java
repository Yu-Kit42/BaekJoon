import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        A %= B;
        for (int i = 0; i < N - 1; i++) {
            A *= 10;
            A %= B;
        }
        A *= 10;
        System.out.println(A / B);

    }
}
