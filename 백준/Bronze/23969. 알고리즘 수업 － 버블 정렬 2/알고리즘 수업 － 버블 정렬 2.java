import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        int N = Integer.parseInt(temp[1]);
        int[] intArr = new int[Integer.parseInt(temp[0])];
        int tp = 0;
        int count = 0;
        boolean ch = false;
        int max = 0;

        String[] arr = bf.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = 0; k < arr.length - i - 1; k++) {
                if (intArr[k] > intArr[k + 1]){
                    tp = intArr[k];
                    intArr[k] = intArr[k + 1];
                    intArr[k + 1] = tp;
                    count++;
                }
                if (count == N) {
                    for (int i1 : intArr) {
                        System.out.print(i1 + " ");
                    }
                    System.exit(0);
                }

            }
        }
        System.out.println(-1);

//        for (int i1 : intArr) {
//            System.out.print(i1 + " ");
//        }
    }
}
