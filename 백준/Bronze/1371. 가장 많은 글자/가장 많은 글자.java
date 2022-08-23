import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String in = "";
        String temp = "";
        int max = 0;
        String out = "";

        while ((in = bf.readLine()) != null) {
            temp += in;
        }
        
        for (char i = 97; i < 123; i++) {
            int count = temp.length() - temp.replace(String.valueOf(i), "").length();

            if (max == count) {
                out += String.valueOf(i);
            }

            if (max < count) {
                max = count;
                out = String.valueOf(i);
            }
        }
        System.out.println(out);
    }
}
