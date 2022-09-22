import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[] strArr = bf.readLine().split(" ");
        int[] intArrFir = new int[N];
        int[] intArrSec = new int[N];

        for (int i = 0; i < N; i++)
            intArrFir[i] = Integer.parseInt(strArr[i]);


        Arrays.sort(intArrFir);

        int M = Integer.parseInt(bf.readLine());
        strArr = bf.readLine().split(" ");

        int tp = 0;
        for (int i = 0; i < M; i++) {
            tp = SB(intArrFir, Integer.parseInt(strArr[i]), 0, N - 1);
            if (tp == -1) System.out.println(0);
            else System.out.println(1);

        }
    }

    private static int SB(int[] arr, int val, int first, int last) {
        if (first > last) return -1;
        int mid = (first + last) / 2;
        if (val == arr[mid]) return mid;
        else if (val < arr[mid]) return SB(arr, val, first, mid - 1);
        else return SB(arr, val, mid + 1, last);
    }
}
