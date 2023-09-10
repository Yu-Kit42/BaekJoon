import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    1. 입력을 받는다
    2. 연산자를 찾는다
    3. 가능한 연산인지 확인한다.
    4. 가능한 연산이라면 연산한다
    5. 출력
 */


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();

        String[] operator = {"*", "/", "+", "-",};
        String operation = "";


        int opIdx = 1;
        char[] inputArr = input.toCharArray();
        for (int i = 0; i < inputArr.length; i++) {
            if (!Character.isDigit(inputArr[i]) && i != 0){
                operation = String.valueOf(inputArr[i]);
                opIdx = i;
                break;
            }
        }



        switch (operation) {
            case "+": {
                operation = "\\+";
                break;
            }
            case "-": {
                operation = "-";
                break;
            }
            case "*": {
                operation = "\\*";
                break;
            }
            case "/": {
                operation = "/";
                break;
            }
        }


        String temp1 = input.substring(0, opIdx);
        String temp2 = input.substring(opIdx + 1);
//        System.out.println(temp1 + " " + temp2 + " " + operation);

        int num1 = Integer.parseInt(temp1, 8);
        int num2 = Integer.parseInt(temp2, 8);
//        System.out.println(num1 + " " + num2);


        long result = 0;
        switch (operation) {
            case "\\+": {
                result = num1 + num2;
                break;
            }
            case "-": {
                result = num1 - num2;
                break;
            }
            case "\\*": {
                result = (long) num1 * num2;
                break;
            }
            case "/": {
                if (num1 == 0 || num2 == 0) result = Long.MAX_VALUE;
                else result = (long) Math.floor((double) num1 / num2);
                break;
            }
        }
        String out = null;
        if (result < 0) out = "-" + Long.toOctalString(result * -1);

        if (result == Long.MAX_VALUE) System.out.println("invalid");
        else if (out != null) System.out.println(out);
        else System.out.println(Long.toOctalString(result));
    }
}
