import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        char[] tp = bf.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();


        int count = 0;
        for (int i = 0; i < tp.length; i++) {
            if (tp[i] == '(') {
                stack.push(tp[i]);
            } else if (tp[i] == ')' && stack.size() == 0){
                count++;
            } else {
                stack.pop();
            }
        }
        System.out.println(count + stack.size());
    }
}
