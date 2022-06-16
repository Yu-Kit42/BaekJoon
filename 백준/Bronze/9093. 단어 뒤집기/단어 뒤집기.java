import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        String[] out = new String[N];
        String add = "";
        String[] inStr;

        for (int i = 0; i < N; i++) {
            inStr = sc.nextLine().split(" ");
            add = "";
            for (int k = 0; k < inStr.length; k++) {
                add += new StringBuffer(inStr[k]).reverse().toString();
                if (k != inStr.length - 1)
                    add += " ";
            }
            out[i] = add;
        }
        for (String s : out)
            System.out.println(s);
    }
}
