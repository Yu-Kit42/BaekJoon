import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
//        int N = sc.nextInt();
        String[] card;
        boolean a = false;
        int sum = 0;
        int[] ch = new int[N];
        int add = 0;

        for (int i = 0; i < N; i++) {
            card = sc.nextLine().split("");
            sum = 0;

            for (int k = 15; k >= 0; k--) {
                if (!a) {
                    add = Integer.parseInt(card[k]);
                    sum += add;
                    a = true;
                } else {
                    add = Integer.parseInt(card[k]) * 2;
                    if (Integer.parseInt(card[k]) * 2 >= 10) {
                        add = Integer.parseInt(card[k]) * 2 % 10 + Integer.parseInt(card[k]) * 2 / 10;
                    }
                    sum += add;
                    a = false;
                }
            }
            ch[i] = sum;
        }
        for (int i : ch) {
            if (i % 10 == 0)
                System.out.println("T");
            else
                System.out.println("F");
        }
    }
}
