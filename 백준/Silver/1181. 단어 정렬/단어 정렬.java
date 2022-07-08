import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        // 인덱스를 기준으로 값을 추가하기 힘들어서 그냥 ArrayList 선언함
        ArrayList<String> str_list = new ArrayList<String>(50);
        ArrayList<String> str_list1 = new ArrayList<String>();
        ArrayList<String> str_list2 = new ArrayList<String>();
        ArrayList<String> str_list3 = new ArrayList<String>();
        ArrayList<String> str_list4 = new ArrayList<String>();
        ArrayList<String> str_list5 = new ArrayList<String>();
        ArrayList<String> str_list50 = new ArrayList<String>();

        String tempInList;
        String temp;

        for (int i = 0; i < N; i++) {
            temp = bf.readLine();

            // 입력받은 문자열의 길이를 문자 앞에 붙혀 정렬 메서드에서 자동 정렬되게 설정
            tempInList = Integer.toString(temp.length()) + temp;

            // 각 자릿수별로 길이를 붙혀줘야 길이1과 길이19가 붙는 상황을 막을수 있음
            if (temp.length() <= 9) {

                str_list1.add(tempInList);
            } else if (temp.length() <= 19) {

                str_list2.add(tempInList);
            } else if (temp.length() <= 29) {

                str_list3.add(tempInList);
            } else if (temp.length() <= 39) {

                str_list4.add(tempInList);
            } else if (temp.length() <= 49) {

                str_list5.add(tempInList);
            } else {

                str_list50.add(tempInList);
            }
        }

        // Collections 에 대해 더 공부해야함
        Collections.sort(str_list1);
        Collections.sort(str_list2);
        Collections.sort(str_list3);
        Collections.sort(str_list4);
        Collections.sort(str_list5);
        Collections.sort(str_list50);
        // addAll 직관성 있는 이름의 메서드
        str_list.addAll(str_list1);
        str_list.addAll(str_list2);
        str_list.addAll(str_list3);
        str_list.addAll(str_list4);
        str_list.addAll(str_list5);
        str_list.addAll(str_list50);

        // 앞에서 길이를 문자열에 붙혀놨기에 subString을 통해 제거후 출력
        for (int i = 0; i < N; i++) {
            if (i != 0 && str_list.get(i).equals(str_list.get(i - 1)))
                continue;
            if (str_list.get(i).length() <= 10) System.out.println(str_list.get(i).substring(1));
            else System.out.println(str_list.get(i).substring(2));
        }

        bf.close();
    }
}
