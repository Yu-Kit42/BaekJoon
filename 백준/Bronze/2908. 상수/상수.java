import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");
        StringBuffer firSb = new StringBuffer(arr[0]);
        int firRe = Integer.parseInt(firSb.reverse().toString());

        StringBuffer lasSb = new StringBuffer(arr[1]);
        int lasRe = Integer.parseInt(lasSb.reverse().toString());

        if (firRe > lasRe) System.out.println(firRe);
        else System.out.println(lasRe);
    }
}
