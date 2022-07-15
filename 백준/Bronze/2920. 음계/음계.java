import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");
        String out = "";

        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.println(Integer.parseInt(arr[arr.length - i - 1])+ " " + Integer.parseInt(arr[arr.length - i - 1]));
            if (Integer.parseInt(arr[i]) + 1 == Integer.parseInt(arr[i + 1])) out = "ascending";
            else if (Integer.parseInt(arr[arr.length - i - 1]) == Integer.parseInt(arr[arr.length - i - 2]) - 1 && !out.equals("ascending")) out = "descending";
            else {
                out = "mixed";
                break;
            }
        }

        System.out.println(out);
    }
}
