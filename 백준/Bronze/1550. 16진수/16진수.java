import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int outNum = 0;

        String inStr = bf.readLine();
        char[] inStrArray = inStr.toCharArray();


        for (int i = 0; i < inStrArray.length; i++) {

            char c = inStrArray[i];
            int num = c;
            if (Character.isAlphabetic(c)) num -= 55;
            else num -= 48;
            if (inStrArray.length - i != 1) num *= (int) Math.pow(16, inStrArray.length - i - 1);
            outNum += num;
        }
        System.out.println(outNum);
    }
}
