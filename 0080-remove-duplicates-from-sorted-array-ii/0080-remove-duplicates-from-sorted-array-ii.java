class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int std=nums[0];//1
        int j=1;//실제 저장될 주소임
        int n=nums.length;
        for(int i=1;i<n;i++){
            int currentnum=nums[i];//1
            if(std==currentnum){
               count++;
               if(count>2){
                 continue;
               }else{
                nums[j++]=currentnum;
               }
            }else{
                std=currentnum;
                count=1;
                nums[j++]=currentnum;
            }
        }
        return j;
    }
}