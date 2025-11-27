
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb=new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String a=br.readLine();
            isPalindrome(a,0,a.length()-1);
        }
        System.out.println(sb);
    }

    public static void isPalindrome(String s,int n,int k){
        if(n>=k){
            sb.append(1+" "+(n+1)+"\n");
            return;
        }
        if(s.charAt(n)==s.charAt(k)){
           isPalindrome(s,n+1,k-1);
        }else{
            sb.append(0+" "+(n+1)+"\n");
         }
    }
}
