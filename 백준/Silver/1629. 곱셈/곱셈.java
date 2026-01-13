import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]arr=br.readLine().split(" ");
        long a=Long.parseLong(arr[0]);
        long b=Long.parseLong(arr[1]);
        c=Long.parseLong(arr[2]);
        System.out.println(temp(a%c,b)%c);

    }
    public static long temp(long a,long n){
       if(n==0){
           return 1;
       }

       else{
           long tmp=temp(a,n/2);
           if(n%2==0){
               return tmp*tmp%c;
           }else{
               return ((tmp*tmp)%c*(a%c))%c;
           }
       }
    }
}
