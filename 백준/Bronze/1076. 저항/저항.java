import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        String in1 = bf.readLine();
        String in2 = bf.readLine();
        String in3 = bf.readLine();

        String val = "";
        String x = "1";
        for (int i = 0; i < 10; i++) {
            if (in1.equals(color[i])) val += i;
        }
        for (int i = 0; i < 10; i++) {
            if (in2.equals(color[i])) val += i;
        }
        for (int i = 0; i < 10; i++) {
            if (in3.equals(color[i])) {
                for (int k = 0; k < i; k++){
                    x += "0";
                }
            };
        }

        long out = Long.parseLong(val) * Long.parseLong(x);
        System.out.println(out);
    }
}
