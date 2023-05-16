import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int nx = Integer.parseInt(st.nextToken());
        int ny = Integer.parseInt(st.nextToken());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int p1 = Math.abs(nx - x);
        int p2 = Math.abs(ny - y);

        int t1 = Math.min(p1, nx);
        int t2 = Math.min(p2, ny);

        System.out.println(Math.min(t1, t2));

    }
}
