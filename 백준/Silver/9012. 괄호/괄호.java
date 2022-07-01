import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] temp_list;
        int open = 0;       // 열린 괄호를 카운트
        int close = 0;      // 닫힌 괄호를 카운트

        for (int I = 0; I < N; I++) {

            open = 0;
            close = 0;
            temp_list = bf.readLine().split("");

            for (int i = 0; i < temp_list.length; i++) {

                if (temp_list[i].equals("(")) {
                    open++;
                } else {
                    close++;
                }
                if (close > open) {             // 한번이라도 닫힌 괄호가 열린 괄호보다 많아지면 no
                    System.out.println("NO");
                    break;
                }

            }
            if (open == close) {                // 닫힌 괄호수와 열린 괄호수가 같다면 YES
                System.out.println("YES");
            } else if (open > close) {          // 열린 괄후수가 더 많으면 no
                System.out.println("NO");
            }
        }

    }
}
