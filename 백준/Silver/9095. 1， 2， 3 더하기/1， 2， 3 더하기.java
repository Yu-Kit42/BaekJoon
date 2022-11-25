import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[12];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for (int i = 4; i <= 11; i++) {
//            System.out.printf("현재:%d 1:%d 2나눔:%d 3나눔:%d \n", i, arr[i - 1], arr[i - 2], arr[i - 3]);
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
//            System.out.println(arr[i]);
        }

        for (int i = 0; i < N; i++){
            System.out.println(arr[Integer.parseInt(bf.readLine())]);
        }


    }
}
