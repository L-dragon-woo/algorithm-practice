
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        int cnt=0;
        int count=0;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                cnt++;
            }else if(input.charAt(i)==')'){
               if(input.charAt(i-1)=='('){
                   cnt--;
                   count+=cnt;
               }else{
                   cnt--;
                   count++;
               }

            }
        }

        System.out.println(count);
    }
}