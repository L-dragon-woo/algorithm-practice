
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();

        for(int i=1;i<=N;i++){
            long n=Long.parseLong(br.readLine());
            //짝수인 경우
            if(n==0 || n==1 || n==2){
                sb.append(2).append("\n");
            }
            else if(n%2==0){
                n++;
                while(!isPrime(n)){
                    n+=2;
                }
                sb.append(n).append("\n");
            }
            //홀수인 경우
            else{
                while(!isPrime(n)){
                    n+=2;
                }
                sb.append(n).append("\n");
            }
        }
        System.out.println(sb);

    }
    public static boolean  isPrime(long num){
        for(long i=2;i<Math.sqrt(num)+1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


}
