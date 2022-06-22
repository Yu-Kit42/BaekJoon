import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] in = bf.readLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int K = Integer.parseInt(in[1]);
        String out = "";

        Queue<Integer> queue = new LinkedList<>(); // 큐 생성 방식
        for (int i = 1; i <= N; i++){              // 큐 초기값 생성
            queue.add(i);
        }
        while (queue.size() != 1) {                // 큐의 사이즈가 1일때까지 반복
            for (int i = 1; i <= K; i++) {         // K까지 큐의 처음값을 뽑아서 다시 삽입 (Ex 1 2 3 = 3 1 2
                if (i == K) {                      // K까지 왔다면 K를 빼낸뒤 출력형식에 맞게 삽입
                    out += Integer.toString(queue.poll()) + "," + " ";
                } else {
                    queue.add(queue.poll());       // 아니면 다시 삽입
                }
            }
        }
        System.out.printf("<%s%s>", out, queue.poll());

    }
}
