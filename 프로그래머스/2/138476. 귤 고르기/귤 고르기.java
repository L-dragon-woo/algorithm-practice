import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer,Integer>map=new HashMap<>();
        
        int answer = 0;
        for (int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int[]arr=new int[map.size()];
        int idx=0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        arr[idx++]=entry.getValue();            
}
        Arrays.sort(arr);
        
        for(int i=arr.length-1;i>=0;i--){
            k-=arr[i];
            if(k<=0){
                answer=arr.length-i;
                break;
            }
        }
        
        
        
        return answer;
    }
}