import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        int cnt = 0;
        int scr = 0;

        for (int i = 0; i < N; i++) {
            if (i == 0 && arr[i].charAt(0) == '1'){
                cnt += ++scr;
                continue;
            }
            if (arr[i].charAt(0) == '1'){
                scr++;
                cnt += scr;
            } else scr = 0;
        }
        System.out.println(cnt);
    }
}
