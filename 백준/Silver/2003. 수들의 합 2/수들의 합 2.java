import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        int sum = 0;
        int count = 0;
        int N = Integer.parseInt(temp[0]);
        int max = Integer.parseInt(temp[1]);

        temp = bf.readLine().split(" ");

        for (int k = 0; k < N; k++) {
            sum = 0;
            for (int i = k; i < N; i++) {
                sum += Integer.parseInt(temp[i]);
//                System.out.println(sum);
                if (max == sum) count++;
                else if (max < sum) break;
            }
        }
        System.out.println(count);

    }
}
