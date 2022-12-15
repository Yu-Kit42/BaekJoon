import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[100000];
        int max = 0;
        int min = 1000000;
        Queue<Integer> q = new LinkedList<Integer>();





        for (int i = 0; i < N; i++) {
            String[] strArr = bf.readLine().split(" ");
            if (strArr.length == 1) {
                q.remove();
            } else {
                int tp = Integer.parseInt(strArr[1]);
                q.add(tp);
                if (q.size() == max && min > tp){
                    min = tp;
                }
                if (q.size() > max) {
                    max = q.size();
                    min = tp;
                }
            }
        }

        System.out.println(max + " " + min);
    }
}
