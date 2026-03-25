import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String tmp=strs[0];
        if(tmp.length()==0)return "";
        int n=strs.length;
        for(int i=1;i<n;i++){
            String str=strs[i];
    
            int m=str.length();
           int N=tmp.length();
        
            StringBuilder sb=new StringBuilder();
            int l=Math.min(N,m);
            for(int j=0;j<l;j++){
                if(tmp.charAt(j)==str.charAt(j)){
                    sb.append(tmp.substring(j,j+1));
                }else{
                    break;
                }
            }
            tmp=sb.toString();
            if(tmp.length()==0)return "";
        }
        return tmp;
    }
}