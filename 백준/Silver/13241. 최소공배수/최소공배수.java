
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        //최소공배수는 a*b에서 최대공약수를 나눈값임!



            StringTokenizer st=new StringTokenizer(br.readLine());
            long A=Long.parseLong(st.nextToken());
            long B=Long.parseLong(st.nextToken());
            System.out.println(A*B/gcd(A,B));

    }

    public static long gcd(long a,long b){
        //b가 더 크다고 설정 b>a
        if(a==0){
            return b;
        }else{
            return gcd(b%a,a);
        }
    }
}
