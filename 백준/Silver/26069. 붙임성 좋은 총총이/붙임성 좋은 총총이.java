import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
    이 댄스는 중독성이 강하기 때문에, 한번 보게 된 사람은 모두 따라 하게 돼버린다.
    즉 두 사람 중 하나라도 무지개댄스를 추고 있다면 둘다 무지개가 된다.

    사람이 무지개댄스를 추고 있는지 확인할 방법으로 HashMap 을 사용

    HashMap<String, Boolean>으로 생성
    유저이름으로 getOrDefault 한다

    입력을 둘로 나눠 사람1과 사람2로 명칭
    1, 2 둘 중 하나라도 무지개일시 둘다 무지개, 만약 무지개가 아닌 사람이있다면 카운트
 */

public class Main {
    static int cnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Boolean> map = new HashMap<>();

        int N = Integer.parseInt(bf.readLine());
        for (int i = 0; i < N; i++) {
            String[] input = bf.readLine().split(" ");
            String h1 = input[0];
            String h2 = input[1];
            isRainbow(h1, h2, map);
        }
        System.out.println(cnt);
    }

    private static void isRainbow(String h1, String h2, HashMap<String, Boolean> map) {
        boolean isRainbow1 = map.getOrDefault(h1, false) || h1.equals("ChongChong");
        boolean isRainbow2 = map.getOrDefault(h2, false) || h2.equals("ChongChong");
        if (isRainbow1 && isRainbow2) return;
        else if (isRainbow1 || isRainbow2) {
            if (isRainbow1) map.put(h2, true);
            else map.put(h1, true);
            cnt++;
        }
    }
}
