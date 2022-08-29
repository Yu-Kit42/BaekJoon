import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] arr = new int[3];
        String[] temp;
        int out = 0;
        int max = 0;

        for (int i = 0; i < N; i++){
            out = 0;
            temp = bf.readLine().split(" ");
            arr[0] = Integer.parseInt(temp[0]);
            arr[1] = Integer.parseInt(temp[1]);
            arr[2] = Integer.parseInt(temp[2]);

            if ((arr[0] == arr[1]) && (arr[0] == arr[2])){
                out += arr[0] * 1000 + 10000;
            } else if (arr[0] == arr[1] || arr[0] == arr[2]) {
                out += arr[0] * 100 + 1000;
            } else if (arr[1] == arr[2]) {
                out += arr[1] * 100 + 1000;
            } else {
                out += Math.max(Math.max(arr[0], arr[1]), arr[2]) * 100;
            }
            if (max < out) max = out;
        }
        System.out.println(max);


    }
}
