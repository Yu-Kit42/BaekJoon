import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String in = bf.readLine();

        for (int i = 0; i < in.length(); i++)
            arr[in.charAt(i) - 97]++;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
