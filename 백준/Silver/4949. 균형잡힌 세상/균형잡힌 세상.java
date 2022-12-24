import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String in = bf.readLine();
        Stack<Character> stack = new Stack<>();
        boolean ch = false;

        while (!in.equals(".")) {
            ch = true;
            stack = new Stack<>();
            for (int i = 0; i < in.length(); i++) {
                if (in.charAt(i) == '(' || in.charAt(i) == '[') stack.push(in.charAt(i));
                if (in.charAt(i) == ')') {
                    if (stack.size() == 0) {
                        ch = false;
                        break;
                    } else if (stack.pop() != '('){
                        ch = false;
                        break;
                    }
                }
                if (in.charAt(i) == ']') {
                    if (stack.size() == 0) {
                        ch = false;
                        break;
                    } else if (stack.pop() != '['){
                        ch = false;
                        break;
                    }
                }
            }
            if (ch && stack.size() == 0) System.out.println("yes");
            else System.out.println("no");
            in = bf.readLine();
        }
    }
}
