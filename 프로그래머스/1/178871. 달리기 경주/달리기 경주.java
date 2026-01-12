import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<players.length;i++){
            map.put(players[i],i);
        }
        //mumu 0 soe 1 poe 2 kai 3 mine 4
        // 
        
        for(int j=0; j<callings.length; j++){
            int a=map.get(callings[j]);//3
            String tmp=players[a];
            String tmp1=players[a-1];
            map.put(tmp1,map.get(tmp1)+1);
            map.put(tmp,map.get(tmp)-1);
            players[a]=players[a-1];
            players[a-1]=tmp;
        }
        return players;
    }
}