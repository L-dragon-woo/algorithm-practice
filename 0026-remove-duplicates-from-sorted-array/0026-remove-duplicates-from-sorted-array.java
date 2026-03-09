import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer>set=new LinkedHashSet<>();

        int n=nums.length;

        int k=0;

        for(int i=0; i<n;i++){
            int num=nums[i];
            if(!set.contains(num)){
                set.add(num);
                k++;
            }
        }

        int idx=0;
        for(int a:set){
            nums[idx++]=a;
        }

        return k;
    }
}