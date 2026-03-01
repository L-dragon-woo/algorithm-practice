import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Deque<Integer>dq=new LinkedList<>();
        Deque<Integer>d=new LinkedList<>();
        
        int max=0;
        for(int i=0;i<priorities.length;i++){
            dq.offerLast(priorities[i]);
            if(i==location){
                d.offerLast(1);
            }else{
                d.offerLast(0);
            }
        }
        
        int num=1;
        
       while(true){
           if(dq.size()==0)break;
           int s=maxsol(dq);
           int a=dq.pollFirst();
           int A=d.pollFirst();
           
           if(a!=s){
           dq.offerLast(a);
            d.offerLast(A);
           }else{
               if(A==1){
                   break;
               }else{
                   num++;
               }
           }
       }
        answer=num;
        return answer;
    }
    private int maxsol(Deque<Integer>dq){
        int m=0;
        for(int i=0; i<dq.size();i++){
            int tmp=dq.pollFirst();
            m=Math.max(m,tmp);
            dq.offerLast(tmp);
        }
        return m;
    }
}