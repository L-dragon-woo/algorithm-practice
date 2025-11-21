import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        while(true){
           int n=Integer.parseInt(br.readLine());
           if(n==0){
            break;
           }else if(n==1){
               sb.append(1).append("\n");
           }else {
               int cnt = 0;
               for (int i = n+1; i <= 2 * n; i++) {
                   if (isPrime(i)) {
                       cnt++;
                   }
               }
               sb.append(cnt).append("\n");
           }
        }
        System.out.println(sb);
    }



   
    public static boolean isPrime(int n){
        for(int i=2; i<(int)Math.sqrt(n)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
