import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    int index;
    int age;
    String name;

    Point(int index, int age, String name) {
        this.index = index;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Point o) {
        if (this.age == o.age) return this.index - o.index;
        else return this.age - o.age;
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
            int age = Integer.parseInt(tp1[0]);
            String name = tp1[1];
            arr.add(new Point(i, age, name));
        }
        Collections.sort(arr);
        for (Point p : arr) sb.append(p.age).append(" ").append(p.name).append("\n");
        System.out.println(sb);
    }
}

