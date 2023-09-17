import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] temp = bf.readLine().split(" ");

        int[] arr = new int[53];

        for (int i = 0; i < N; i++) arr[Integer.parseInt(temp[i])]++;
//        System.out.println();
//        for (int i = 0; i < 53; i++) {
//            System.out.print(i + "\t");
//        }
//        System.out.println();
//        for (int i = 0; i < 53; i++) {
//            int t = i;
//            if (t >= 25) t +=6;
//            System.out.print(((char) (t + 64)) + "\t");
//        }
//        System.out.println();
//        for (int i : arr) System.out.print(i + "\t");


        char[] input = bf.readLine().toCharArray();

        for (int i = 0; i < N; i++) {
//            System.out.print(input[i]);
            int n = input[i];
            if (n == 32) n = 0;
            else if (65 <= n && n <= 90) n -= 64;
            else n -= 70;
            if (--arr[n] < 0) {
//                System.out.println(input[i]);
                end();
            }
        }

        System.out.println("y");


    }

    private static void end() {
        System.out.println("n");
        System.exit(0);
    }
}
