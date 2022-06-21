import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] in = bf.readLine().split(" ");        //  입력값이 2개라 배열로 받고 나눠줌
        int N = Integer.parseInt(in[0]);
        int K = Integer.parseInt(in[1]);
        boolean[] chArr = new boolean[N + 1];               // i의 배수를 지울배열
        int count = 0;

        for (int i = 2; i <= N; i++) {
            if (chArr[i])                                   // 만약 i가 누군가의 배수라서 지워졌다면 컨티뉴
                continue;

            for (int j = i; j <= N; j += i) {
                if (!chArr[j]){                             // 지워지지 않은 수일경우 지움으로 카운트 (Ex 2 와 3의 공배수는 6은 이미 지워짐)
//                    System.out.print("!");
                    count++;
                }
                chArr[j] = true;
//                System.out.print(j + " ");
                if (count == K){                            // 지운 횟수가 K와 같은지 검사하고 출력후 exit
                    System.out.println(j);
                    System.exit(0);
                }
            }
//            System.out.println();
        }

    }
}
