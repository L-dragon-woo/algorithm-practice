import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());

        //최소공배수는 a*b에서 최대공약수를 나눈값임!
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken());
            int B=Integer.parseInt(st.nextToken());
            list.add(A*B/gcd(A,B));
        }

        for(Integer i:list){
            System.out.println(i);       
        }
    }

    public static int gcd(int a,int b){
        //b가 더 크다고 설정 b>a
        if(a==0){
            return b;
        }else{
            return gcd(b%a,a);
        }
    }
}
