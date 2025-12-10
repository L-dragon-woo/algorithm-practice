import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());

        int sum=(int)Math.pow(a,2);
        for(int i=0;i<4;i++){
            int b=Integer.parseInt(st.nextToken());
            sum+=Math.pow(b,2);

        }

        System.out.println(sum%10);

    }
}
