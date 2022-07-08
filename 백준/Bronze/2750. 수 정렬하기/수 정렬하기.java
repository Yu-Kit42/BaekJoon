import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        boolean[] arr = new boolean[2001];

        for (int i = 0; i < N; i++){
            arr[Integer.parseInt(bf.readLine()) + 1000] = true;
        }

        for (int i = 0; i < 2001; i++){
            if (arr[i])
                System.out.println(i - 1000);
        } 

    }
}
