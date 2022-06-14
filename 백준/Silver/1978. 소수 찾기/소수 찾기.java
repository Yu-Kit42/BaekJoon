import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bf.readLine());
        String[] in = bf.readLine().split(" ");
        int sum = 0;
        int las = 0;
        boolean ch = false;


        for (int k = 0; k < N; k++) {
            ch = false;
            las = Integer.parseInt(in[k]);
            if (las < 2) {
                continue;
            }
            for (int i = 2; i < las; i++){
                if (las % i == 0){
                    ch = true;
                    break;
                }
            }
            if (!ch)
                sum++;
        }
        System.out.println(sum);
        bf.close();
        bw.flush();
    }
}
