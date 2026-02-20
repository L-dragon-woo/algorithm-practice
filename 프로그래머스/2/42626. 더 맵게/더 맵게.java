import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        
        for(int i=0; i<scoville.length;i++){
            pq.add(scoville[i]);
        }
        
        int cnt=0;
        while(true){
            int small=pq.poll();
            if(small>=K)break;
            if(pq.isEmpty()){
                cnt=-1;
                break;
            }
            int small1=pq.poll();
            int s=small+small1*2;
            cnt++;
            pq.add(s);
        }
        
        int answer = cnt;
        return answer;
    }
}