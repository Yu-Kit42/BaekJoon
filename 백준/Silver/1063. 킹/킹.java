import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int kx = 0;
    static int ky = 0;
    static int sx = 0;
    static int sy = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bf.readLine().split(" ");
        char[] Alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};


        kx = temp[0].charAt(0) - 65 + 1;
        ky = temp[0].charAt(1) - '0';
        sx = temp[1].charAt(0) - 65 + 1;
        sy = temp[1].charAt(1) - '0';


        int N = Integer.parseInt(temp[2]);

        for (int i = 0; i < N; i++) {
            kMove(bf.readLine());
//            System.out.printf("킹위치:%d, %d, 돌위치:%d, %d \n", kx, ky, sx, sy);
        }
        System.out.println(Alphabet[kx - 1] + Integer.toString(ky));
        System.out.println(Alphabet[sx - 1] + Integer.toString(sy));

    }

    private static void kMove(String order) {
        switch (order) {
            case "R":
                if (kx + 1 == sx && ky == sy) sMove(order);
                else if (kx + 1 == 9) return;
                else kx += 1;
                return;

            case "L":
                if (kx - 1 == sx && ky == sy) sMove(order);
                else if (kx - 1 == 0) return;
                else kx -= 1;
                return;

            case "B":
                if (ky - 1 == sy && kx == sx) sMove(order);
                else if (ky - 1 == 0) return;
                else ky -= 1;
                return;

            case "T":
                if (ky + 1 == sy && kx == sx) sMove(order);
                else if (ky + 1 == 9) return;
                else ky += 1;
                return;

            case "RT":
                if (kx + 1 == sx && ky + 1 == sy) sMove(order);
                else if (kx + 1 == 9 || ky + 1 == 9) return;
                else {
                    kx += 1;
                    ky += 1;
                }
                return;

            case "LT":
                if (kx - 1 == sx && ky + 1 == sy) sMove(order);
                else if (kx - 1 == 0 || ky + 1 == 9) return;
                else {
                    kx -= 1;
                    ky += 1;
                }
                return;

            case "RB":
                if (kx + 1 == sx && ky - 1 == sy) sMove(order);
                else if (kx + 1 == 9 || ky - 1 == 0) return;
                else {
                    kx += 1;
                    ky -= 1;
                }
                return;
            case "LB":
                if (kx - 1 == sx && ky - 1 == sy) sMove(order);
                else if (kx - 1 == 0 || ky - 1 == 0) return;
                else {
                    kx -= 1;
                    ky -= 1;
                }
                return;
        }
    }

    private static void sMove(String order) {
        switch (order) {
            case "R":
                if (sx + 1 == 9) return;
                else {
                    kx += 1;
                    sx += 1;
                }
                return;

            case "L":
                if (sx - 1 == 0) return;
                else {
                    kx -= 1;
                    sx -= 1;
                }
                return;

            case "B":
                if (sy - 1 == 0) return;
                else {
                    ky -= 1;
                    sy -= 1;
                }
                return;

            case "T":
                if (sy + 1 == 9) return;
                else {
                    ky += 1;
                    sy += 1;
                }
                return;

            case "RT":
                if (sy + 1 == 9 || sx + 1 == 9) return;
                else {
                    kx += 1;
                    ky += 1;
                    sx += 1;
                    sy += 1;
                }
                return;

            case "LT":
                if (sx - 1 == 0 || sy + 1 == 9) return;
                else {
                    kx -= 1;
                    ky += 1;
                    sx -= 1;
                    sy += 1;
                }
                return;

            case "RB":
                if (sx + 1 == 9 || sy - 1 == 0) return;
                else {
                    kx += 1;
                    ky -= 1;
                    sx += 1;
                    sy -= 1;
                }
                return;

            case "LB":
                if (sx - 1 == 0 || sy - 1 == 0) return;
                else {
                    kx -= 1;
                    ky -= 1;
                    sx -= 1;
                    sy -= 1;
                }
                return;
        }
    }
}
