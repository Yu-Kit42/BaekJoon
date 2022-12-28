import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] tp = bf.readLine().split("");
		int[] arr = new int[10];
		int idx = 0;
		int out = 0;

		for (int i = 0; i < tp.length; i++) {
			arr[Integer.parseInt(tp[i])]++;
		}
		
//		System.out.println(max + " " + idx + " " + arr[idx]);
		
		for (int i = 0; i < 10; i++) {
			if(arr[idx] < arr[i] && i != 6 && i != 9) idx = i;
		}
		if((arr[6] + arr[9])> arr[idx] * 2) {
			int tp1 = (arr[6] + arr[9]) % 2;
			if(tp1 == 0) {
				out = (arr[6] + arr[9]) / 2;
			} else if(tp1 != 0){
				out = (arr[6] + arr[9]) / 2 + 1;
			}
		} else {
			out = arr[idx];
		}

		System.out.println(out);
	}
}
