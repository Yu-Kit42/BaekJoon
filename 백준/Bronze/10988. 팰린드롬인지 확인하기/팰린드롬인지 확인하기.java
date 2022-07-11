import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        boolean check = true;


        for (int i = 0; i < in.length() / 2 + 1; i++){
            if (in.charAt(i) != in.charAt((in.length() - i - 1))){
                check = false;
                break;
            }
        }

        if (check)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
