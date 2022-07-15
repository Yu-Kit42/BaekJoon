import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String in = bf.readLine();
        in = in.toUpperCase();

        int max = 0;
        int idx = 0;
        boolean check = false;

        int[] count = new int[26];

        for (int i = 0; i < in.length(); i++) {
            count[in.charAt(i) - 65]++;
        }

        for (int i = 0; i < 26; i++) {
            if (max < count[i]) {
                max = count[i];
                check = false;
                idx = i;
            } else if (max == count[i]) check = true;
        }


        char out = (char) (idx + 65);
        if (check) System.out.println("?");
        else System.out.println(out);
//        for (int i : count)
//            System.out.print(i + " ");

    }
}
