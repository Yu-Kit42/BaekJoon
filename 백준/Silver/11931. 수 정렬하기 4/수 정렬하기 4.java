import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        boolean[] arr = new boolean[2000001];
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < N; i ++){
            arr[Integer.parseInt(bf.readLine()) + 1000000] = true;
        }

        for (int i = arr.length; i > 0; i--){
            if (arr[i - 1]) sb.append(i - 1000001).append("\n");
        }

        System.out.println(sb);
    }
}
