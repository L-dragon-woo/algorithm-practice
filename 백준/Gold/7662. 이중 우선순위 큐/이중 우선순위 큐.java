import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        int n=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int k=Integer.parseInt(br.readLine());
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
            Map<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<k;j++){
                String[] str=br.readLine().split(" ");
                String a=str[0];
                int b=Integer.parseInt(str[1]);
                if(a.equals("I")){
                    pq.offer(b);
                    pq1.offer(b);
                    map.put(b,map.getOrDefault(b,0)+1);
                }else{
                    if(b>0){
                        while(!pq1.isEmpty()){
                            int x=pq1.poll();
                            if(map.getOrDefault(x,0)>0){
                                map.put(x,map.get(x)-1);
                                if(map.get(x)==0)map.remove(x);
                                break;
                            }
                        }
                    }else{
                        while(!pq.isEmpty()){
                            int x=pq.poll();
                            if(map.getOrDefault(x,0)>0){
                                map.put(x,map.get(x)-1);
                                if(map.get(x)==0)map.remove(x);
                                break;
                            }
                        }
                    }
                }
            }

            if(map.isEmpty()){
                sb.append("EMPTY\n");
            }else{
                int max=0,min=0;
                while(!pq.isEmpty()){
                    int x=pq1.peek();
                    if(map.getOrDefault(x,0)>0){
                        max=x;
                        break;
                    }
                    pq1.poll();
                }
                while(max!=min){
                    int x=pq.peek();
                    if(map.getOrDefault(x,0)>0){
                        min=x;
                        break;
                    }
                    pq.poll();
                }
                sb.append(max).append(" ").append(min).append("\n");
            }
        }
        System.out.println(sb);
    }
}
