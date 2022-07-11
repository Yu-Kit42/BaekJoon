import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());
        int[] cnt = new int[10001];

        // 정수가 입력되면 count를 증가시켜서 정수의 총 입력갯수를 구함
        for (int i = 0; i < N; i++){
            cnt[Integer.parseInt(bf.readLine())] ++;
        }

        // count가 1보다 크다면 빌더에 넣고 값 감소 반복
        for(int i = 1; i < 10001; i++){
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
