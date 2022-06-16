import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            1 ~ N 까지의 합을 구하는 식을 사용하여 계산을 줄인다
            i까지의 합이 N보다 크다면 N + 1의 합이라는 뜻이므로 i - 1을 출력한다
            최대값이 크기때문에 롱
         */
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long i = 1;


        while ((i * (i + 1) / 2 <= N)) {
//            System.out.println((i * (i + 1) / 2));
            i++;
        }

        System.out.println(i - 1);
    }
}
