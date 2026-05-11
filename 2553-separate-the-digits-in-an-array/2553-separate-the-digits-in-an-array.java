import java.util.*;
class Solution {
    public int[] separateDigits(int[] nums) {
        int n= nums.length;
        Deque<Character>dq=new LinkedList<>();

        for(int i=0;i<n;i++){
            String str=Integer.toString(nums[i]);
            int s=str.length();
            for(int j=0;j<s;j++){
                dq.offerLast(str.charAt(j));
            }
        }
        
        int a=dq.size();
        int[] ans=new int[a];

        for(int i=0; i<a;i++){
            ans[i]=dq.pollFirst()-'0';
        }

        return ans;
        
    }
}