import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String in = "";
        String[] in_list = new String[3];
        for (int i = 0; i < N; i++){
            in = sc.nextLine();
            in_list = in.split(",");
            System.out.println(Integer.parseInt(in_list[0]) + Integer.parseInt(in_list[1]));
        }
    }
}
