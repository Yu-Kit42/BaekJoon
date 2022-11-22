import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        BigInteger[] arr = new BigInteger[N + 1];
//        long[] arr = new long[N + 1];

        if (N == 0 || N == 1){
            System.out.println(N);
            System.exit(0);
        }

        arr[0] = new BigInteger("0");
        arr[1] = new BigInteger("1");

        for (int i = 2; i < N + 1; i++){
            arr[i] = new BigInteger(String.valueOf(arr[i -1].add(arr[i - 2])));
        }

        System.out.println(arr[N]);
        bf.close();
    }
}
