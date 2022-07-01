import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] in = bf.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int K = Integer.parseInt(in[1]);

        String[] list = bf.readLine().split(" ");
        int[] Int_list = Arrays.stream(list).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(Int_list);

        System.out.println(Int_list[K - 1]);
    }
}
