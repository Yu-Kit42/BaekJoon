import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String in = "";
        int count = 0;
        int n = 0;
        int k = 0;
        int now = 0;
        int new1 = 0;


        while ((in = bf.readLine()) != null){
            count = 0;
            n = Integer.parseInt(in.split(" ")[0]);
            k = Integer.parseInt(in.split(" ")[1]);
            now = n;
            count += n;
            while (now >= k){
//                System.out.println("현재 치킨주문가능한 개수" + Math.floor(now / k));
//                System.out.println("현재 남은 쿠폰 개수" + now % k);
                new1 = (int) Math.floor(now / k);
                now = ((int) Math.floor(now / k)) + now % k;
//                System.out.printf("현재 총 쿠폰개수 %d\n", now);
                count += new1;
            }
//            System.out.println("\n주문 끝남");
            System.out.println(count);
        }
    }
}
