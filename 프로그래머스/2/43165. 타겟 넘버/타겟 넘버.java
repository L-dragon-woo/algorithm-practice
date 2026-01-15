import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        Queue<int[]>q=new LinkedList<>();
        q.offer(new int[]{0,0});
        
    while(!q.isEmpty()){
        int[] cur=q.poll();
        int sum=cur[0];
        int idx=cur[1];
        if(sum==target&&idx==numbers.length){
            answer++;
            continue;
        }
        
        if(idx==numbers.length){
            continue;
        }
        
        int idxx=idx;
        idxx++;
        q.offer(new int[]{sum+numbers[idx],idxx});
        q.offer(new int[]{sum-numbers[idx],idxx});
    }
        
        return answer;
    }
}