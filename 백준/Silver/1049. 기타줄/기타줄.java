import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int minPackage = Integer.MAX_VALUE;
        int minOne = Integer.MAX_VALUE;

        // 각 브랜드 별 패키지, 낱개 가격을 입력받아 최소값을 저장한다.
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            minPackage = Math.min(minPackage, Integer.parseInt(st.nextToken()));
            minOne = Math.min(minOne, Integer.parseInt(st.nextToken()));
        }

        // 낱개 가격이 패키지 가격보다 싸다면 낱개로 전체 구입
        if (minOne * Math.min(N, 6) <= minPackage) {
            System.out.println(N * minOne);
            System.exit(0);
        }

        // 필요한 갯수에 근접하게 패키지로 구입 후, 나머지 줄을 낱개로 사는게 싼지, 패키지로 사는게 싼지 검사.
        int price = N / 6 * minPackage;
        int remnantLine = N % 6;
        price += Math.min(minOne * remnantLine, minPackage);

        System.out.println(price);
    }
}
