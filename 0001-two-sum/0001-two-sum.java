import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer=new int[2];
        Map<Integer,Integer>map=new HashMap<>();//value,idx
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=target-a;
            if(map.containsKey(b)){
                int z=map.get(b);
                if(z==i)continue;
                answer[0]=i;
                answer[1]=z;
                break;
            }
        }



        return answer;
    }
}