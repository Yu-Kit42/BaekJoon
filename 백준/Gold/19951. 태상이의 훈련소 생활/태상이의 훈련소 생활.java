import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(bf.readLine());

        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int start =  Integer.parseInt(st.nextToken()) - 1;
            int end =  Integer.parseInt(st.nextToken());
            int order =  Integer.parseInt(st.nextToken());

            for (int j = start; j < end; j++) arr[j] += order;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) sb.append(arr[i]).append(" ");

        System.out.println(sb);
    }
}
