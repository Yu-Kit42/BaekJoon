
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr = new int[3];


        while (true) {
            st = new StringTokenizer(bf.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (Arrays.stream(arr).sum() == 0) break;
            Arrays.sort(arr);
            
            if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) sb.append("right");
            else sb.append("wrong");
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
