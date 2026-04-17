import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer>set=new HashSet<>();
        String str=String.valueOf(n);
        while(true){
            int sum=0;
            int m=str.length();
            for(int i=0; i<m;i++){
                int a=(int)str.charAt(i)-'0';
                a=a*a;
                sum+=a;
            }
            if(sum==1)return true;
            if(!set.contains(sum)){
                set.add(sum);
            }else{
                return false;
            }
            str=String.valueOf(sum);    
        }
    }
}