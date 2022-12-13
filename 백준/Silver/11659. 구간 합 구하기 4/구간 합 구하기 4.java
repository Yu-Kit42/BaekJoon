import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String tp = bf.readLine();
        String[] tpArr = bf.readLine().split(" ");


        int N = Integer.parseInt(tp.split(" ")[0]);
        int M = Integer.parseInt(tp.split(" ")[1]);


        int sum = 0;
        int[] arr = new int[N];
        int[] sumArr = new int[N + 1];
        sumArr[0] = 0;
        for (int i = 0; i < N; i++) {
            tp = tpArr[i];
            sum += Integer.parseInt(tp);
            arr[i] = Integer.parseInt(tp);
            sumArr[i + 1] = sum;
        }

//        for (int i : sumArr){
//            System.out.print(i + " ");
//        }
//        System.out.println();

        for (int i = 0; i < M; i++) {
            tpArr = bf.readLine().split(" ");
            sb.append(sumArr[Integer.parseInt(tpArr[1])] - sumArr[Integer.parseInt(tpArr[0]) - 1]).append("\n");
        }
        System.out.println(sb);
    }
}
