import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N + 1];
        if (N == 1){ System.out.println(0); System.exit(0);}

        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        for (int m = 3; m <= N; m++) {
            int i = m;
            int x = 999999;
            int y = 999999;

            if (i % 3 == 0)  x = arr[i / 3];
            if (i % 2 == 0)  y =  arr[i / 2];

//            System.out.printf("현재:%d -1:%d 3나눔:%d 2나눔:%d \n", i, i -1, x, y);
            arr[i] =  Math.min(arr[i - 1], Math.min(x, y)) + 1;
//            System.out.println(arr[i]);
        }
        if (arr[N] >= 999999) System.out.println(-1);
        else System.out.println(arr[N]);
    }
}
