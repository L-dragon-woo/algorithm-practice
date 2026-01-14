import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] date=new int[progresses.length];
        //입력받기
        for(int i=0; i<date.length;i++){
            date[i]=(100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]!=0){
                date[i]+=1;
            }
            System.out.println(Arrays.toString(date));
        }
        
        Queue<Integer>ans=new LinkedList<>();        
        int num=0;
        int std=date[0];
        for(int i=1;i<date.length;i++){
            System.out.print("std : "+std+" date[i]: "+date[i]+" num: "+num+" ");
            if(std>=date[i]){
                num++;
            }else{
                ans.offer(num+1);
                num=0;
                std=date[i];
            }
            if(i==date.length-1){
                ans.offer(num+1);
            }
            
        }    
        int[] answer = new int[ans.size()];
        for(int i=0; i<answer.length;i++){
            answer[i]=ans.poll();
        }
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}