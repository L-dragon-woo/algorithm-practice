import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') sb.append((char)(c - 32)); 
            else if (c >= 'A' && c <= 'Z') sb.append((char)(c + 32));
            else sb.append(c); 
        }
        System.out.print(sb.toString());
    }
}
