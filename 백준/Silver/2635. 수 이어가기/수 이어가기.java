import javax.sound.midi.SoundbankResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력받기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        // 사용할 변수 선언
        ArrayList<Integer> maxHistoryList = new ArrayList<>(); // 최대 개수의 수의 이력을 저장할 리스트
        ArrayList<Integer> historyList = new ArrayList<>(); // 매 연산마다 사용할 리스트
        int limit = N / 2;
        if (limit == 0) limit++; // 1이 입력된 경우에 /2한 결과가 0이 되어서 1로 만들어 줘야 한다.

        for (int i = N; i >= limit; i--) {

            historyList.add(N); // 맨앞에 입력받은 N 저장
            historyList.add(i); // 그 다음 뺄 수 저장
            int nowIdx = 0;

            while (true) {
                nowIdx++;
                int newNum = historyList.get(nowIdx - 1) - historyList.get(nowIdx); // 자기 앞에 있는 수와 자기 수를 계산하여 새로운 수 생성
//                System.out.println(historyList + " " + newNum); // 디버그용

                // 0이상이면 리스트에 저장하고 계속 진행, 아니라면 종료
                if (newNum >= 0) historyList.add(newNum);
                else break;
            }

            // 새롭게 생성된 리스트가 최대길이 리스트보다 크다면 업데이트
            if (historyList.size() > maxHistoryList.size()) {
                maxHistoryList.clear();
                maxHistoryList.addAll(historyList);
            }
            historyList.clear();
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        sb.append(maxHistoryList.size()).append("\n");
        for (Integer i : maxHistoryList) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
    }
}
