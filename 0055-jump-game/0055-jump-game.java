import java.util.*;
class Solution {
    public boolean canJump(int[] nums) {
       int n= nums.length;
       boolean[] visited=new boolean[n];
       Deque<Integer>dq=new LinkedList<>(); //인덱스값을 담을것임
       //초기 세팅
       if(n==1)return true;

       for(int i=1;i<nums[0]+1;i++){
         if(i<n&&visited[i]==false){
            visited[i]=true;
            dq.offerLast(i);
         }
       }
       while(!dq.isEmpty()){
        int num=dq.pollLast();
        for(int i=0; i<nums[num]+1;i++){
            if(num+i<n&&visited[num+i]==false){
                visited[num+i]=true;
                dq.offerLast(num+i);
            }
        }
       }
        return visited[n-1];
    }
}