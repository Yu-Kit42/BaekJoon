import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.y == o.y) return this.x - o.x;
        else return this.y - o.y;
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());


        ArrayList<Point> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] tp1 = bf.readLine().split(" ");
            int x = Integer.parseInt(tp1[0]);
            int y = Integer.parseInt(tp1[1]);
            arr.add(new Point(x, y));
        }

        Collections.sort(arr);
        for (Point p : arr) sb.append(p.x).append(" ").append(p.y).append("\n");
        System.out.println(sb);
    }
}

