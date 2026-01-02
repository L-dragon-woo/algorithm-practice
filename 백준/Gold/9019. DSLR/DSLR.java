import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());


        StringBuilder ans = new StringBuilder();
        for(int t=0;t<T;t++) {
            String[] arr=br.readLine().split(" ");
            int A=Integer.parseInt(arr[0]);
            int B=Integer.parseInt(arr[1]);

            Queue<Object[]> q=new LinkedList<>();
            q.offer(new Object[]{A,new String()});
            boolean[] visited=new boolean[10001];
            while(!q.isEmpty()){
                Object[] obj=q.poll();
                int num=(int)obj[0];
                String name=(String)obj[1];
                if(num==B){
                    ans.append(name).append("\n");
                    break;
                }
                //D
                int D=(num*2)%10000;
                if(visited[D]==false){
                    visited[D]=true;
                    q.offer(new Object[]{D,name+"D"});
                }

                //S
                int S=num==0?9999:num-1;
                if(visited[S]==false){
                    visited[S]=true;
                    q.offer(new Object[]{S,name+"S"});
                }

                //L
                int L=num*10;//12340
                L+=(L/10000);//12341
                L%=10000;//2341
                if(visited[L]==false){
                    visited[L]=true;
                    q.offer(new Object[]{L,name+"L"});
                }

                //R
                int r=num%10;//4
                int R=num/10;//123
                R+=r*1000;//4123
                if(visited[R]==false){
                    visited[R]=true;
                    q.offer(new Object[]{R,name+"R"});
                }
            }
        }
        System.out.println(ans);
    }
}
