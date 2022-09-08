import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String in = "";
        String order = "";

        ArrayList<Integer> queue = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            in = bf.readLine();
            order = in.split(" ")[0];
            switch (order) {
                case "push": {
                    queue.add(Integer.parseInt(in.split(" ")[1]));
                    break;
                }
                case "pop": {
                    if (queue.size() == 0) System.out.println(-1);
                    else {
                        System.out.println(queue.get(0));
                        queue.remove(0);
                    }
                    break;
                }
                case "size": {
                    System.out.println(queue.size());
                    break;
                }
                case "empty": {
                    if (queue.size() == 0) System.out.println(1);
                    else System.out.println(0);
                    break;
                }
                case "front": {
                    if (queue.size() == 0) System.out.println(-1);
                    else System.out.println(queue.get(0));
                    break;
                }
                case "back": {
                    if (queue.size() == 0) System.out.println(-1);
                    else System.out.println(queue.get(queue.size() - 1));
                    break;
                }
            }
        }

    }
}
