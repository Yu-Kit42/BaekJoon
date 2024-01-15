import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static ArrayList<Long> list = new ArrayList<>();

    /*


    정렬한 배열에서 맨뒤 숫자 두개를 꺼내서 더한뒤 이진탐색으로 리스트에 끼워 넣어
    [10, 9, 8, 7, 6, 5, 5, 3, 3, 2, 2, 1, 1]

    그럼 아래와 같은 배열이 되고 다시 위를 반복하면?
    [10, 9, 8, 7, 6, 5, 5, 3, 3, 2, 2, 2, 2]

    이런식으로 계속 이진 탐색 해 나가면 되는 것?
    [10, 9, 8, 7, 6, 5, 5, 4, 4, 3, 3, 2, 2]

     */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = bf.readLine().split(" ");
        int N = Integer.parseInt(inputLine[0]);
        int M = Integer.parseInt(inputLine[1]);

        inputLine = bf.readLine().split(" ");

        long out = 0;
        long tempInt = 0;
        for (int i = 0; i < N; i++) {
            tempInt = Long.parseLong(inputLine[i]);
            list.add(tempInt);
            out += tempInt;
        }

        list.sort(Collections.reverseOrder());

        for (int l = 0; l < M; l++) {
//            for (Long lo : list) {
//                System.out.print(lo + " ");
//            }
//            System.out.println(list.size());
            int size = list.size() - 1;
            long i1 = list.remove(size--);
            long i2 = list.remove(size--);
            long sum = i1 + i2;

            out -= i1;
            out -= i2;
            out += sum * 2;


            if (size == -1) {
                list.add(sum);
                list.add(sum);
            }
            for (int i = size; i >= 0; i--) {
                long now = list.get(i);

                if (now >= sum) {
                    int pl = now == sum ? i : i + 1;
                    list.add(pl, sum);
                    list.add(pl, sum);
                    break;
                } else if (i == 0) {
                    list.add(0, sum);
                    list.add(0, sum);
                    break;
                }
            }
//            System.out.println("현재 총합: " + out);
        }
        System.out.println(out);
    }

//    private static int EJIN(int t) {
//        if (list.isEmpty()) list.add(t);
//        else
//    }
}
