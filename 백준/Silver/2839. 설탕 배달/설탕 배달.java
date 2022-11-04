import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int i1 = 0;

        int[] arr = new int[N + 1];

        arr[0] = 0;
        arr[1] = -1;
        arr[2] = -1;

        for (int i = 3; i <= N; i++) {

            if (i - 5 < 0) i1 = 1;
            else i1 = i - 5;

            if (arr[i] == 0){
                arr[i] = arr[i] = min(arr[i - 3], arr[i1]) + 1;
            }
//            System.out.printf("현재 숫자: %d 첫번째: %d, 두번째: %d, 세번째: %d \n", i, arr[i - 2], arr[i1], arr[i2]);
//            System.out.println(arr[i]);
        }
        if (arr[N] >= 5000) System.out.println(-1);
        else System.out.println(arr[N]);
    }

    static int min(int i, int k) {

        if (i == -1) i = 5000;
        if (k == -1) k = 5000;

        return Math.min(i, k);
    }
}
