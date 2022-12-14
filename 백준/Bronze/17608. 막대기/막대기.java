import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(bf.readLine());


        int max = 0;
        int cnt = 0;
        for (int i = N - 1; i >= 0; i--){
            if (arr[i] > max){
                max = arr[i];
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}

