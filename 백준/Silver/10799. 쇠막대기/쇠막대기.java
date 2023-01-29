
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] temp = bf.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < temp.length; i++) {
            if (!stack.isEmpty() && temp[i] == ')') {
                if (stack.peek() == '(' && temp[i - 1] != ')') {
                    stack.pop();
                    cnt += stack.size();
                } else {
                    stack.pop();
                    cnt++;
                }
//                System.out.println(cnt);
            } else {
                stack.push(temp[i]);
            }
        }
        System.out.println(cnt);
    }
}

