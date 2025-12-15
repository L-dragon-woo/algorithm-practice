import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String str;
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb=new StringBuilder();
    while(true){
        str=br.readLine();
        if(str.equals("0")) break;
        if(pallindrome(0,str.length()-1)){
            sb.append("yes\n");
        }else{
            sb.append("no\n");
        }
    }

        System.out.println(sb);
    }

    public static boolean pallindrome(int start,int end){
       if(start>=end) return true;
       return str.charAt(start)
               ==str.charAt(end)&&pallindrome(start+1,end-1);
    }


}
