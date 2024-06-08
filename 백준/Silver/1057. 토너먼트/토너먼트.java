
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int kim = Integer.parseInt(st.nextToken());
        int im = Integer.parseInt(st.nextToken());

        int count = 1;
        while (Math.abs(kim - im) != 1 || Math.min(kim, im) % 2 == 0) {
            kim = kim / 2 + (kim % 2 == 0 ? 0 : 1);
            im = im / 2 + (im % 2 == 0 ? 0 : 1);
            count++;
//            System.out.printf("kim: %d, im: %d\n", kim, im);
//            if (count >= 10) break;
        }

        System.out.println(count);
    }
}
