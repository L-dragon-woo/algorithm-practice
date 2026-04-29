class Solution {
    public int searchInsert(int[] nums, int target) {
        int lidx=0;
        int ridx=nums.length-1;

        while(lidx<=ridx){
            int left=nums[lidx];
            int right=nums[ridx];

            if(left==target)return lidx;
            if(right==target)return ridx;

            
            if(right<target)return ridx+1;
            if(left>target)return lidx;

            if(left<target)lidx++;
            if(right>target)ridx--;

        }
        return lidx;
    }
}