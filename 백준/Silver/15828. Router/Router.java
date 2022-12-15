import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int in = Integer.parseInt(bf.readLine());
        Queue<Integer> q = new LinkedList<>();

        while (in != -1) {
            if (in == 0) q.remove();
            else if (q.size() != N) q.add(in);
            in = Integer.parseInt(bf.readLine());
        }
        N = q.size();
        if (q.size() == 0) System.out.println("empty");
        else for (int i = 0; i < N; i++)
            System.out.print(q.poll() + " ");

    }
}
