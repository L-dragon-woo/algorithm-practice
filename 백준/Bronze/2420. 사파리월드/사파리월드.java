import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[]arr=br.readLine().split(" ");
        long a=Long.parseLong(arr[0]);
        long b=Long.parseLong(arr[1]);

        System.out.println((long)Math.abs(a-b));
    }
}
