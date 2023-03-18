import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String tp = bf.readLine();
        char[] arr = tp.toCharArray();
        int len = arr.length;
        int lang = 0;

        boolean isJ = false;
        boolean isC = false;


        if (arr[arr.length - 1] == 95) {
            System.out.println("Error!");
            System.exit(0);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] == 95) {
                System.out.println("Error!");
                System.exit(0);
            }
            if (arr[i] <= 90 && 65 <= arr[i]) {

                if (i == 0 || isC) {
                    System.out.println("Error!");
                    System.exit(0);
                }
                lang = 1;
                isJ = true;

            } else if (arr[i] == 95) {
                if (arr[i - 1] == 95 || isJ) {
                    System.out.println("Error!");
                    System.exit(0);
                }
                lang = 2;
                isC = true;
            }
        }

        boolean ch = false;
        if (lang == 2) {
            for (int i = 0; i < arr.length; i++) {
                if (ch) {
                    sb.append((char) (arr[i] - 32));
                    ch = false;
                } else if (arr[i] != 95) {
                    sb.append(arr[i]);
                }
                if (arr[i] == 95) {
                    ch = true;
                }
            }

        } else if (lang == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= 90 && 65 <= arr[i]) {
                    sb.append("_");
                    sb.append((char) (arr[i] + 32));
                } else sb.append(arr[i]);
            }

        } else sb.append(tp);


        System.out.println(sb);

    }
}
