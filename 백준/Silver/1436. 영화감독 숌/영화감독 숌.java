import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int cnt = 0;

        int i = 1;
        while (cnt != N) {
            i++;
            int temp = i;
            while (temp != 0) {
                if (temp % 1000 == 666) {
                    cnt++;
                    break;
                } else temp /= 10;
            }
        }
        System.out.println(i);
    }
}
