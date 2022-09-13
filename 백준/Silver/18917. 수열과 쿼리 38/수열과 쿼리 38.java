import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        long sum = 0;
        long xor = 0;
        int In = 0;

        String in = "";

        for (int i = 0; i < N; i++) {
            in = bf.readLine();

            switch (in.charAt(0)) {
                case '1':
                    In = Integer.parseInt(in.substring(2));
                    sum += In;
                    xor ^= In;
                    break;   case '2':
                    In = Integer.parseInt(in.substring(2));
                    sum -= In;
                    xor ^= In;
                    break;
                case '3':
                    System.out.println(sum);
                    break;
                case '4':
                    System.out.println(xor);
                    break;
            }
        }

    }
}

