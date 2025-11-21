
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=1;
        boolean temp=true;
        Stack<Integer> stack=new Stack<>();
        Stack<Character>op=new Stack<>();

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            while(count<=num){
                stack.push(count);
                op.push('+');
                count++;
            }

            if(stack.peek()==num){
                stack.pop();
                op.push('-');
            }else{
                temp=false;
            }

            if(temp==false){
                System.out.println("NO");
                break;
            }

        }
        if(temp==true){
            for(Character c:op){
                System.out.println(c);
            }
        }



    }
}
