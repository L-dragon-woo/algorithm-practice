import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        int n =s.length();
        int m=t.length();

        if(n!=m)return false;
        
        Map<Character,Integer>map=new HashMap<>();
        
        for(int i=0; i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<n;i++){
            char ch1=t.charAt(i);
            if(!map.containsKey(ch1))return false;
            else{
                int tmp=map.get(ch1);
                tmp--;
                if(tmp<0) return false;
                map.put(ch1,tmp);
            }
        }

        
        return true;
    }
}