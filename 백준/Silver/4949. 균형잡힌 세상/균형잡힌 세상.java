
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        while(true) {
            String[] str=br.readLine().split("");
            Stack<String> stack=new Stack<>();
            if(str[0].equals(".")) break;
            for(int i=0; i<str.length;i++){
                String a=str[i];
                if(a.equals("(")||a.equals("[")){
                    stack.push(a);
                }else if(a.equals(")")&&!stack.isEmpty() &&stack.peek().equals("(")){
                    stack.pop();
                }else if(a.equals("]")&&!stack.isEmpty()&&stack.peek().equals("[")){
                    stack.pop();
                }else if(a.equals(")")||a.equals("]")){
                    stack.push(a);
                }
            }
            if(stack.isEmpty()){
                sb.append("yes").append("\n");
            }else{
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
    }
}
