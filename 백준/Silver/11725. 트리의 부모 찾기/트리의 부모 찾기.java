import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] ans=new int[N+1];

        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        ans[1]=1;

        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=1;i<N+1;i++){
            map.put(i,new ArrayList<>());
        }

        for(int i=0;i<N-1;i++){
            String[]tmp=br.readLine().split(" ");
            int a=Integer.parseInt(tmp[0]);
            int b=Integer.parseInt(tmp[1]);
            map.get(a).add(b);
            map.get(b).add(a);
        }

        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()){
            int a=q.poll();//1
            if(set.contains(a)){
                List<Integer> list=map.get(a);//6, 4
                for(int i:list){
                    if(set.contains(i))continue;
                    if(ans[i]==0) {
                        ans[i] = a;
                        set.add(i);
                        q.offer(i);
                    }
                }
            }
        }
        for(int i=2;i<N+1;i++){
            System.out.println(ans[i]);
        }

    }
}
