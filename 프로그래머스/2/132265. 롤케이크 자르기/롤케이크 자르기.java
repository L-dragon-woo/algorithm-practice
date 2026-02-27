import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<topping.length;i++){
            int a=topping[i];
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        Set<Integer>set=new HashSet<>();
        for(int j=0;j<topping.length;j++){
            int top=topping[j];
            set.add(top);
            map.put(top,map.get(top)-1);
            if(map.get(top)==0){
                map.remove(top);
            }
            if(map.size()==set.size())answer++;
            
        }
        
        return answer;
    }
}