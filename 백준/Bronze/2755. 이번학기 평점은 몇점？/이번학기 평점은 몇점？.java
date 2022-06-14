import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] in;
        double sum = 0;
        double re = 0;
        double avg;
        int sumS = 0;

        for (int i = 0; i < N; i++) {
            in = sc.nextLine().split(" ");
            switch (in[2]) {
                case "A+":
                    sum = 4.3;
                    break;
                case "A0":
                    sum = 4.0;
                    break;
                case "A-":
                    sum = 3.7;
                    break;
                case "B+":
                    sum = 3.3;
                    break;
                case "B0":
                    sum = 3.0;
                    break;
                case "B-":
                    sum = 2.7;
                    break;
                case "C+":
                    sum = 2.3;
                    break;
                case "C0":
                    sum = 2.0;
                    break;
                case "C-":
                    sum = 1.7;
                    break;
                case "D+":
                    sum = 1.3;
                    break;
                case "D0":
                    sum = 1.0;
                    break;
                case "D-":
                    sum = 0.7;
                    break;

                case "F":
                    sum = 0;
                    break;
            }
            re += sum * Integer.parseInt(in[1]);
            sumS += Integer.parseInt(in[1]);
        }
        System.out.printf("%.2f", re / (double) sumS);
    }
}
