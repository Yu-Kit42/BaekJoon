import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> queue = new ArrayList<Integer>(N);
        String out = "";

        for (int i = 1; i <= N; i++)
            queue.add(i);
//        for (int i : queue)
//            System.out.print(i + " ");

        for (int i = 0; i < N - 1; i++) {
//            System.out.println(i + " " + queue.get(i));
            out += Integer.toString(queue.get(i)) + " ";
            queue.remove(i);
            queue.add(queue.get(i));
//            System.out.println(queue.get(i));
        }

        System.out.println(out + queue.get(N - 1));
    }
}
