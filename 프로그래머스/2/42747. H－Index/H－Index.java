import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        int min=10001;
        int m=0;
        for(int i=citations.length-1;i>=0;i--){
            int c=citations[i];
            int idx=citations.length-i;
            System.out.println(c+" "+idx);
            min=Math.min(c,idx);
            if(min>m){
                m=min;
            }else if(min<m){
                break;
            }
            
        }
        
        answer=m;
        return answer;
    }
}