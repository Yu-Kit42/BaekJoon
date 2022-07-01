import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int sum_ = 0;
        int N = Integer.parseInt(bf.readLine());
        String[] temp = bf.readLine().split(" ");
        int[] time_list = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(time_list);

        for (int i = 0; i <N; i++){
            sum += sum_ + time_list[i];
            sum_ += time_list[i];
//            System.out.printf("합계: %d 펙토리얼 + i: %d \n", sum, sum_ + time_list[i]);
        }


        System.out.println(sum);
    }


}
