import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        long start = System.currentTimeMillis();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = bf.readLine().split(" ");
        int fir = Integer.parseInt(a[0]);
        int las = Integer.parseInt(a[1]);
        boolean[] prime = new boolean[las + 1];    // 0 ~ N


        if(las < 2) {
            return;
        }

        prime[0] = prime[1] = true;
        for(int i = 2; i <= Math.sqrt(las); i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }
        for(int i = fir; i < prime.length; i++) {
            if(prime[i] == false) {	// 소수(false)일 경우 출력
                System.out.println(i);
            }
        }

        bf.close();
        bw.flush();
    }
}
