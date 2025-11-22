
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());
        //N보다 큰 완전수? 를 구하기
        while(true){
            double n=Math.sqrt(N);
            if(n*n==N){
                System.out.println((int)n);
                break;
            }else{
                N--;
            }
        }

    }
}
