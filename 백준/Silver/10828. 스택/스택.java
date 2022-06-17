import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String in = "";
        String[] stack = new String[N];
        int idx = 0;

        for (int i = 0; i < N; i++){
            in = bf.readLine();

            if (in.split(" ").length == 2) {
                idx++;
                stack[idx] = in.split(" ")[1];
            }

            switch (in) {
                case "pop":
                    if (idx == 0) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(stack[idx]);
                    idx--;
                    break;

                case "size":
                    System.out.println(idx);
                    break;

                case "empty":
                    if (idx <= 0)
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;

                case "top":
                    if (idx <= 0)
                        System.out.println(-1);
                    else
                        System.out.println(stack[idx]);
                    break;
            }
//            System.out.println(idx);
        }
    }
}
