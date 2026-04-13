import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();
        Map<String,Character> map1=new HashMap<>();
        String[] sarr=s.split(" ");

        int n=pattern.length();

        if(sarr.length!=n)return false;

        for(int i=0;i<n;i++){
            char ch=pattern.charAt(i);
            String ss=sarr[i];
            if(!map.containsKey(ch)){
                map.put(ch,ss);
            }else{
             //있는경우
             String str=map.get(ch);
             if(!str.equals(ss)){
                return false;
             }   
            }

            if(!map1.containsKey(ss)){
                map1.put(ss,ch);
            }else{
                char tmp=map1.get(ss);
                if(tmp!=ch){
                    return false;
                }
            }

        }
        return true;

    }
}