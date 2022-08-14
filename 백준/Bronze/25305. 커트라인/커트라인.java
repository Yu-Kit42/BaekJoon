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

        String[] arr = bf.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }

//        for (int i : intArr) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

        for (int i = arr.length - 1; i > 0; i--) {

            for (int k = 0; k < i; k++) {
                if (intArr[i] < intArr[k]) {
                    tp = intArr[i];
                    intArr[i] = intArr[k];
                    intArr[k] = tp;
                }
            }
            count++;
            if (count == N) {
                System.out.println(intArr[i]);
                System.exit(0);
            }
        }
        System.out.println(intArr[0]);

    }
}
