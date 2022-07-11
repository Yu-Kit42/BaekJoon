import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String in_str = sc.nextLine();
        while (!in_str.equals("END")){
            for (int i = 0; i < in_str.length(); i++)
                System.out.print(in_str.charAt(in_str.length() - i - 1));
            System.out.println();
            in_str = sc.nextLine();
        }
    }
}
