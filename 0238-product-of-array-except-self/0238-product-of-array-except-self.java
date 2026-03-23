import java.util.*;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
    
        int prefix=1;
        int suffix=1;

        int zeroE=0;
        int zeroidx=0;

        for(int i=0; i<n;i++){
            if(nums[i]==0){
                zeroE++;
                zeroidx=i;
                continue;
            }
            suffix*=nums[i];
        }
        if(zeroE>=2){
            Arrays.fill(nums,0);
            return nums;
        }
        for(int i=0; i<n;i++){
            int num=nums[i];
            if(zeroE==1&&i==zeroidx){
                Arrays.fill(nums,0);
                nums[i]=suffix*prefix;
                return nums;
            }else{
            suffix/=nums[i];
            nums[i]=suffix*prefix;
            prefix*=num;
            }
        }

        return nums;
    }
}