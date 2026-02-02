import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Long> value = new HashMap<>();
        Map<String, Long> mul = new HashMap<>();

        String[] colors = {
                "black","brown","red","orange","yellow",
                "green","blue","violet","grey","white"
        };

        for (int i = 0; i < 10; i++) {
            value.put(colors[i], (long) i);
            mul.put(colors[i], (long) Math.pow(10, i));
        }

        String c1 = br.readLine();
        String c2 = br.readLine();
        String c3 = br.readLine();

        long result = (value.get(c1) * 10 + value.get(c2)) * mul.get(c3);
        System.out.println(result);
    }
}
