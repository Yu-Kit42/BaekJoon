import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fir = sc.nextLine();
        String cal = sc.nextLine();
        String las = sc.nextLine();
        String temp = "";
        if (las.length() > fir.length()) {
            temp = fir;
            fir = las;
            las = temp;
//            System.out.printf("fir: %s las: %s\n", fir, las);
        }


        switch (cal) {
            case "+":
                if (fir.length() == las.length()) {
                    System.out.printf("2%s", fir.substring(1));
                    break;
                }
                System.out.println(fir.substring(0, fir.length() - las.length()) + las);
                break;
            case "*":
                System.out.println(fir + las.substring(1));
                break;
        }
    }
}
