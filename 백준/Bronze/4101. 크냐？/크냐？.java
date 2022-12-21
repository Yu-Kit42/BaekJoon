import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] in = bf.readLine().split(" ");
        while (!in[0].equals("0") && !in[1].equals("0")){
            if (Integer.parseInt(in[0]) > Integer.parseInt(in[1])) sb.append("Yes");
            else sb.append("No");
            sb.append("\n");
            in = bf.readLine().split(" ");
        }

        System.out.println(sb);
    }
}
