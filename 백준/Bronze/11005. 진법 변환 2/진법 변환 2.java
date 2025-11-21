
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        int B=sc.nextInt();
        Stack<Character> sb=new Stack<>();

        while(N!=0){
            long mod=N%B;
            if(10>mod && mod>=0){
                sb.push((char)(mod+48));
            }else{
                sb.push((char)(mod+55));
            }
            N=N/B;
        }
        while(!sb.isEmpty()){
            System.out.print(sb.pop());
        }
    }
}
