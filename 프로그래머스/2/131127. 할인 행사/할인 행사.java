import java.util.*;
class Solution {
    int n=0;
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String,Integer>map=new HashMap<>();
        int answer = 0;
        n=want.length;//1
        
        //map은 충족하는 거 갯수임
        for(int i=0; i<n;i++){
            map.put(want[i],number[i]);    
        }//apple 10
        
        Map<String,Integer>ans=new HashMap<>();
        
        //첫 만남은 너무 어려워 계획대로 되는 게 없어서
        for(int j=0;j<10;j++){
            ans.put(discount[j],ans.getOrDefault(discount[j],0)+1);
        }
        //banana 10
        int lp=0;
        int rp=10;
        
        while(true){
            if(isCorrect(map,ans,want)){
                answer++;
            }
            if(rp>=discount.length)break;
            ans.put(discount[lp],ans.get(discount[lp])-1);
            lp++;
            ans.put(discount[rp],ans.getOrDefault(discount[rp],0)+1);
            rp++;
        }
        
        return answer;
    }
    
    private boolean isCorrect(Map<String,Integer>map,Map<String,Integer>ans,String[]want){
        for(int i=0; i<n;i++){
            if(map.get(want[i])!=ans.getOrDefault(want[i],0))return false;
        }
        return true;
    }
}