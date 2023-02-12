import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int n = 0; n < T; n++) {
            String[] Itp = bf.readLine().split(" ");
            int H = Integer.parseInt(Itp[0]);
            int W = Integer.parseInt(Itp[1]);
            int N = Integer.parseInt(Itp[2]);
            int i = (N % H == 0 ? H : N % H);
            i *= 100;
            int t = (N % H == 0 ? N / H : N / H + 1);
            System.out.println(i + t);
        }
    }
}
