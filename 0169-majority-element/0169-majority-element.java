import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        int max=0;
        int std=0;
        for(int i=0; i<n;i++){
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
            int a=map.get(num);
            if(max<a){
                max=a;
                std=num;
            }
        }
        return std;

    }
}