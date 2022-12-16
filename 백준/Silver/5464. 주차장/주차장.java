import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static String[] aaa = new String[3];
    static int N = 0;
    static int M = 0;
    static Queue<Integer> q = new LinkedList<>();

    static long sumPrice = 0;
    static int carCnt = 0;

    static int[] nowCar = new int[N];
    static int[] price = new int[N];
    static int[] weight = new int[M];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        aaa = bf.readLine().split(" ");
        N = Integer.parseInt(aaa[0]);
        M = Integer.parseInt(aaa[1]);

        nowCar = new int[N];
        price = new int[N];
        weight = new int[M];

        for (int i = 0; i < N; i++)
            price[i] = Integer.parseInt(bf.readLine());

        for (int i = 0; i < M; i++)
            weight[i] = Integer.parseInt(bf.readLine());

        for (int i = 0; i < M * 2; i++) {
            int car = Integer.parseInt(bf.readLine());
//            System.out.println("현재 차 번호: " + car);

            if (car > 0) {
                if (carCnt < N) {
                    for (int k = 0; k < N; k++) {
                        if (nowCar[k] == 0) {
                            addCar(car, k);
                            break;
                        }
                    }
                } else {
                    q.add(car);
                }
            } else {
                for (int k = 0; k < N; k++) {
                    if (nowCar[k] == Math.abs(car)) {
                        delCar(car, k);
                        break;
                    }
                }
            }

        }

        System.out.println(sumPrice);

    }

    private static void addCar(int car, int now) {
        sumPrice += (long) weight[car - 1] * price[now];
//        System.out.printf("현재 차번호:%d, 차위치:%d 주차료:%d 무게:%d 총가격:%d\n", car, now, price[now], weight[car - 1], price[now] * weight[car - 1]);
        nowCar[now] = car;
        carCnt++;
    }

    private static void delCar(int car, int now) {
//        System.out.printf("현재 차번호:%d, 차위치:%d\n", car, now);
        nowCar[now] = 0;
        carCnt--;
        if (!q.isEmpty()) addCar(q.poll(), now);
    }

}
