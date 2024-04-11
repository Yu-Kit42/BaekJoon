// Working program using Reader Class

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0; n < N; n++) {
            // 데이터 입력 부분
            char[] op = bf.readLine().toCharArray();
            int inLen = Integer.parseInt(bf.readLine());
            int[] arr = new int[inLen];

            String input = bf.readLine().substring(1);
            input = input.substring(0, input.length() - 1);
            StringTokenizer st = new StringTokenizer(input, ",");

            for (int i = 0; i < inLen; i++) arr[i] = Integer.parseInt(st.nextToken());
            // 데이터 부분 종료

            int p1 = 0;
            int p2 = inLen - 1;

            boolean isReverse = false;
            boolean isError = false;

            for (int i = 0; i < op.length; i++) {
                if (op[i] == 'R') isReverse = !isReverse;
                else {
                    if (inLen == 0) {
                        isError = true;
                        break;
                    }
                    if (!isReverse) {
                        if (p1 == inLen){
                            isError = true;
                            break;
                        }
                        else arr[p1++] = 0;
                    } else {
                        if (p2 == 0){
                            isError = true;
                            break;
                        }
                        arr[p2--] = 0;
                    }
                }
//                System.out.println(op[i] + " " + Arrays.toString(arr));
            }


            if (!isError) {
                if (inLen == 0) {
                    sb.append("[]\n");
                    continue;
                } else if (inLen == 1) {
                    sb.append("[");
                    sb.append(arr[0] == 0 ? "" : arr[0]);
                    sb.append("]\n");
                    continue;
                }
                sb.append("[");
                if (isReverse) {
                    for (int i = inLen - 1; i >= 0; i--) {
                        if (arr[i] != 0) {
                            sb.append(arr[i]);
                            if (i != 0 && arr[i - 1] != 0) sb.append(",");
                        }
//                        System.out.println(arr[i]);
                    }
                } else {
                    for (int i = 0; i < inLen; i++) {
                        if (arr[i] != 0) {
                            sb.append(arr[i]);
                            if (i + 1 < inLen && arr[i + 1] != 0) sb.append(",");
                        }
//                        System.out.println(arr[i]);
                    }
                }
                sb.append("]").append("\n");
            } else sb.append("error").append("\n");
        }
        System.out.println(sb);
    }
}
