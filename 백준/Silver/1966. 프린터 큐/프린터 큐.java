import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(bf.readLine());
        String[] temp;

        int size = 0;
        int point = 0;
        int max = 0;
        int count = 0;

        for (int k = 0; k < N; k++) {

            temp = bf.readLine().split(" "); // 크기와 포인터 입력
            size = Integer.parseInt(temp[0]);      // 크기
            point = Integer.parseInt(temp[1]);     // 포인터

            temp = bf.readLine().split(" ");  // 큐 값 입력받기
            int[] sortarr = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray(); // 우선순위를 정렬할 배열
            Arrays.sort(sortarr);                   // 정렬
            max = sortarr[sortarr.length - 1];      // 우선순위 정하기
            count = 0;                              // 카운트를 초기화

            // 큐를 초기화해서 재사용
            queue.clear();

            // 큐 초기값 할당
            for (int i = 0; i < size; i++) {
                queue.add(Integer.parseInt(temp[i]));
            }

            while (true) {
                // 큐의 값이 우선순위가 제일 높은 값이라면 출력하기
                if (queue.peek() == max) {
                    count++;

                    // 우선순위가 제일 높으며 포인터가 0이라면 출력할 문서가 되므로 카운트를 출력
                    if (point == 0) {
                        System.out.println(count);
                        break;
                    }
                    queue.poll();   // 큐 값 제거
                    point--;        // 큐의 크기가 줄어들었으므로 포인터 감소

                    if (count == sortarr.length)
                        max = sortarr[0];
                    else
                        max = sortarr[sortarr.length - 1 - count]; // 그다음 우선순위를 지정
                } else {
                    queue.add(queue.poll());

                    // 포인터가 0 이라면 포인터에 값이 다시 뒤로 가기에 다시 크기 - 1한 값으로 이동시킴
                    if (point == 0) {
                        point = queue.size() - 1;
                    } else {
                        point--;
                    }
                }
            }

        }
    }
}
