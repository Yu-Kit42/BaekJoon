import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] inStr = new String[N];
        String[] rever = new String[N];
        String[] split;
        String add = "";

        for (int i = 0; i < N; i++) {
            inStr[i] = sc.nextLine();
            add = "";
            split = inStr[i].split(" ");
            for (int k = 0; k < split.length; k++) {
                add += split[split.length - 1 - k] + " ";
            }
            rever[i] = add;
        }


        for (int i = 0; i < N; i++) {
            System.out.printf("Case #%d: %s\n", i + 1, rever[i]);
        }
    }
}
