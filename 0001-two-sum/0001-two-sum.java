import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer=new int[2];
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i=0; i<n;i++){
            int num=nums[i];
            map.put(num,i);
        }

        for(int i=0;i<n;i++){
            int num1=nums[i];
            if(map.containsKey(target-num1)&&i!=map.get(target-num1)){
                answer=new int[]{i,map.get(target-num1)};
                return answer;
            }
        }


        return answer;
    }
}