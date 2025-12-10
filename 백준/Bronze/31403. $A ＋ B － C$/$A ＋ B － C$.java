import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a=0;
        int b=0;
        int c=0;
        int[] arr=new int[3];
        for(int i=0; i<3; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        a=arr[0];
        b=arr[1];
        c=arr[2];
        StringBuilder sb=new StringBuilder();
        sb.append(a).append(b);
        int num=Integer.parseInt(sb.toString());

        System.out.println(a+b-c);
        System.out.println(num-c);
    }
}
