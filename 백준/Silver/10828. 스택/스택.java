import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(bf.readLine());
        String[] stack = new String[N];

        int idx = -1;

        for (int i = 0; i < N; i++){
            String[] in = bf.readLine().split(" ");

            switch (in[0]){
                case "push":
                    idx++;
                    stack[idx] = in[1];
                    break;

                case "pop":
                    sb.append((idx == -1 ? -1 : stack[idx--])).append("\n");
                    break;

                case "size":
                    sb.append(idx + 1).append("\n");
                    break;

                case "empty":
                    sb.append((idx == -1 ? 1 : 0)).append("\n");
                    break;

                case "top":
                    sb.append((idx == -1 ? -1 : stack[idx])).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}

