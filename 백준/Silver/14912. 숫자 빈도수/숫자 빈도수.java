import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String in = bf.readLine();
        int N = Integer.parseInt(in.split(" ")[0]);
        String check = in.split(" ")[1];
        String[] arr = new String[7];
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            cnt += Integer.toString(i).length() - Integer.toString(i).replaceAll(check, "").length();
        }
        System.out.println(cnt);

    }
}
