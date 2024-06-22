
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] size = new int[6];

        for (int i = 0; i < 6; i++) size[i] = Integer.parseInt(st.nextToken()); 
        
        st = new StringTokenizer(bf.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int orderT = 0;
        int orderBundle = 0;
        int orderPEach = 0;

        for (int i = 0; i < 6; i++) orderT += size[i] % T == 0 ? size[i] / T : size[i] / T + 1;
        orderBundle = N / P;
        orderPEach = N % P;

        System.out.printf("%d\n%d %d", orderT, orderBundle, orderPEach);
    }
}
