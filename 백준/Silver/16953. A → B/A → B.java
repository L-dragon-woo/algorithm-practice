import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr=br.readLine().split(" ");
        int A=Integer.parseInt(arr[0]);
        int B=Integer.parseInt(arr[1]);

        Queue<int []>q=new LinkedList<>();
        boolean[] visited=new boolean[B+1];

        q.offer(new int[]{A,1});
        boolean flag=true;
        while(!q.isEmpty()){
            int[] temp=q.poll();
            if(temp[0]==B){
                System.out.println(temp[1]);
                flag=false;
                break;
            }
            if((long)temp[0]*2<=B && visited[temp[0]*2]==false){
                q.offer(new  int[]{temp[0]*2,temp[1]+1});
                visited[temp[0]*2]=true;
            }
            if((long)temp[0]*10+1<=B && visited[temp[0]*10+1]==false){
                q.offer(new  int[]{temp[0]*10+1,temp[1]+1});
                visited[temp[0]*10+1]=true;
            }
        }
        if(flag){
            System.out.println(-1);
        }
    }
}
