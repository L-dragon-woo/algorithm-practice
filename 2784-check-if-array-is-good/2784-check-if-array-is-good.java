// 배열 길이가 n + 1이어야 하고
// 최댓값이 n이어야 하며
// 1 ~ n-1은 한 번씩
// n은 두 번 있어야 한다
import java.util.*;
class Solution {
    public boolean isGood(int[] nums) {
        int n=nums.length;//4
        Arrays.sort(nums);
        int num=nums[n-1];//최댓값//3
        if(num+1!=n)return false;
        
        for(int i=0; i<n-2;i++){
            if(nums[i]==nums[i+1])return false;
        }
        if(nums[n-1]!=nums[n-2])return false;

        return true;
    }
}