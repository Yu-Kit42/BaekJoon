import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        
        for (int i = 0; i < N; i++) {
            String inStr = bf.readLine();
            String reverseStr = "";
            for (int j = inStr.length() - 1; j >= 0; j--) reverseStr += inStr.charAt(j);
            int sum = Integer.parseInt(inStr) + Integer.parseInt(reverseStr);
            String strSum = Integer.toString(sum);

            int strSumLen = strSum.length();
            boolean ch = true;
            for (int j = 0; j < strSumLen / 2; j++) {
                if (strSum.charAt(j) != strSum.charAt(strSumLen - j - 1)){
                    ch = false;
                    break;
                }
            }
            System.out.println(ch ? "YES" : "NO" );
        }
    }
}
