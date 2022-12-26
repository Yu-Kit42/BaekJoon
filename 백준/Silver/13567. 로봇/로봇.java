import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int size = 0;
	static int nowDir = 1;
	static int x = 0;
	static int y = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] tp = bf.readLine().split(" ");

		size = Integer.parseInt(tp[0]);
		int N = Integer.parseInt(tp[1]);

		for (int i = 0; i < N; i++) {
			tp = bf.readLine().split(" ");
			if (tp[0].equals("MOVE"))
				move(Integer.parseInt(tp[1]));
			else if (tp[0].equals("TURN"))
				turn(Integer.parseInt(tp[1]));
//			System.out.printf("방향:%d X:%d Y:%d 이동:%d\n",nowDir, x, y, Integer.parseInt(tp[1]));
		}
		System.out.println(x + " " + y);
	}

	private static void turn(int i) {
		if (i == 0)
			nowDir -= 1;
		else
			nowDir += 1;
		if (nowDir == -1)
			nowDir = 3;
		else if (nowDir == 4)
			nowDir = 0;

	}

	private static void move(int move) {
		
		if (nowDir == 0) {
			if (y + move > size) {
				System.out.println("-1");
				System.exit(0);
			} else
				y += move;

		} else if (nowDir == 1) {
			if (x + move > size) {
				System.out.println("-1");
				System.exit(0);
			} else
				x += move;

		} else if (nowDir == 2) {
			if (y - move < 0) {
				System.out.println("-1");
				System.exit(0);
			} else
				y -= move;
			
		} else if (nowDir == 3) {
			if (x - move < 0) {
				System.out.println("-1");
				System.exit(0);
			} else
				x -= move;
		}
	}
}
