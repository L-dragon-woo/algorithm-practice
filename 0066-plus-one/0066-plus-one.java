import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        n--;
        digits[n]++;

        while(n>0){
            if(digits[n]>=10){
                digits[n-1]+=1;
                digits[n]=digits[n]%10;
            }
            n--;
        }

        if(digits[0]<10){
            return digits;
        }else{
            int[] ans=new int[digits.length+1];
            ans[0]=1;
            ans[1]=digits[0]%10;
            for(int i=2;i<ans.length;i++){
                ans[i]=digits[i-1];
            }
            return ans;
        }

    }
}