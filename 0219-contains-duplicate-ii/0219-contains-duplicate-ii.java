import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        boolean ans=false;
        Map<Integer,Integer>map=new HashMap<>();//값, idx

        for(int i=0; i<n;i++){
            int num=nums[i];
            if(!map.containsKey(num)){
                map.put(num,i);
            }else{
                //같은게 있다면
                int idx=map.get(num);
                if(Math.abs(i-idx)<=k){
                    return true;
                }else{
                    ans=false;
                }
                map.put(num,i);
            }
        }
        return ans;
    }
}