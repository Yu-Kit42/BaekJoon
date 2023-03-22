import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int now = 0;
        int cnt = 0;
        int[] arr = new int[W];

        Queue<Integer> q = new LinkedList<>();
        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++) {
            q.add(Integer.parseInt(st.nextToken()));
        }

        while (true) {

//            System.out.println("현재 q 맨위: " + q.peek());

            // 버스가 다리에서 빠져나감
            if (arr[W - 1] != 0) {
//                System.out.println("다리에서 빠져나감: " + arr[W - 1]);
                now -= arr[W - 1];
                arr[W - 1] = 0;
            }

            // 버스가 한칸씩 이동
            for (int i = W - 2;  i >= 0; i--) {
                if (arr[i] != 0) {
                    arr[i + 1] = arr[i];
                    arr[i] = 0;
                }
            }

            if (q.isEmpty() && now == 0) break;

            // 다리 올라감
            if (!q.isEmpty() && now + q.peek() <= L) {
//                System.out.println("다리에 올라감: " + q.peek());
                arr[0] = q.peek();
                now += q.poll();
            }


//            for (int i : arr) System.out.print(i + " ");
//            System.out.println();

            cnt++;
        }
        System.out.println(cnt + 1);


    }
}


/*


 */