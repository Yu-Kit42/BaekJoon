import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] in;

        in = sc.nextLine().split("");
        Arrays.sort(in);

        for (int i = 0; i < in.length; i++)
            System.out.print(in[in.length - i - 1]);
    }
}
