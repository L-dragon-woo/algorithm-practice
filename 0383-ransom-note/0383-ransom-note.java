import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer>map=new HashMap<>();
        int n= magazine.length();
        for(int i=0; i<n;i++){
            char ch=magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int m=ransomNote.length();
        for(int i=0;i<m;i++){
            char chh=ransomNote.charAt(i);
            if(!map.containsKey(chh)||map.get(chh)==0){
                return false;
            }else{
                int num=map.get(chh);
                num--;
                map.put(chh,num);
            }
        }

        return true;

    }
}