import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] tp = bf.readLine().split(" ");
        int at = Integer.parseInt(tp[0]) + 1;
        int ar = Integer.parseInt(tp[1]);
        int lf = Integer.parseInt(tp[2]);

        int ardam = 0;
        int lfdam = 0;

        int[][][] Case = new int[at][lf][2];

        for (int i = 0; i < at; i++) {
            for (int k = 0; k < lf; k++) {
                Case[i][k][0] = -1;
                Case[i][k][1] = -1;
            }
        }

        Case[0][lf - 1][0] = ar;
//        for (int i = 0; i < at; i++) {
//            for (int k = 0; k < lf; k++) {
//                System.out.print(Case[i][k][0] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i < at; i++) {
            tp = bf.readLine().split(" ");
            ardam = Integer.parseInt(tp[0]);
            lfdam = Integer.parseInt(tp[1]);

            for (int k = 0; k < lf; k++) {
                boolean ch = true;
                if (Case[i - 1][k][0] == -1) continue;

                if (ardam == -1 || lfdam == 0) {
                    if (k - lfdam < 0) {
                        Case[i][k][0] = -1;
                    } else if (Case[i - 1][k][0] >= Case[i][k - lfdam][0]) {
                        Case[i][k - lfdam][0] = Case[i - 1][k][0];
                        Case[i][k - lfdam][1] = lfdam;
                    }
                } else if (ardam == 0 || lfdam == -1) {
                    if (Case[i - 1][k][0] - ardam <= 0) {
                        Case[i][k][0] = 0;
                    } else if (Case[i - 1][k][0] - ardam >= Case[i][k][0]){
                        Case[i][k][0] = Case[i - 1][k][0] - ardam;
                    }
                } else {

                    if (Case[i - 1][k][0] - ardam > -1) {
                        Case[i][k][0] = Math.max(Case[i][k][0], Case[i - 1][k][0] - ardam);
                    }
                    if (k - lfdam > -1) {
                        if (Case[i - 1][k][0] >= Case[i][k - lfdam][0]) {
                            Case[i][k - lfdam][0] = Case[i - 1][k][0];
                            Case[i][k - lfdam][1] = lfdam;
                        }
                    }
                }

            }
        }

        /*
        System.out.printf("%d  %d  %d  %d  %d\n", 1, 2, 3, 4, 5);
        for (int i = 0; i < at; i++) {
            for (int k = 0; k < lf; k++) {
                System.out.print(Case[i][k][0] + " ");
            }
            System.out.println();
        }
        */

        int idx = -1;
        String out = "";

        for (int i = 0; i < lf; i++)
            if (Case[at - 1][i][0] != -1) idx = i;

        if (idx == -1) {
            System.out.println("NO");
            System.exit(0);
        } else {
            System.out.println("YES");
        }

        for (int i = at - 1; i > 0; i--) {
            if (Case[i][idx][1] == -1) {
                out += "A";
            } else {
                out += "L";
                idx += Case[i][idx][1];
            }
        }
        System.out.println(new StringBuilder(out).reverse().toString());

        /*
        System.out.printf("라이프 %d %d %d %d %d\n", 1, 2, 3, 4, 5);
        for (int i = 0; i < at; i++) {
            System.out.printf("공격함 ");
            for (int k = 0; k < lf; k++) {
                System.out.print(Case[i][k][0] + " ");
            }
            System.out.println();
        }

        int idx = -1;
        String out = "";
        for (int i = 0; i < lf; i++) if (Case[at - 1][i][0] != -1) idx = i;

        if (idx == -1) {
            System.out.println("NO");
            System.exit(0);
        } else {
            System.out.println("YES");
        }

        for (int i = at - 1; i > 0; i--) {
            if (Case[i][idx][1] == -1) {
                out += "A";
            } else {
                out += "L";
                idx += Case[i][idx][1];
            }
        }

5 4 5
1 2
4 -1
-1 2
-1 2
0 2
*/
    }
}
