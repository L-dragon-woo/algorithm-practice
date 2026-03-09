import java.util.*;
class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int[] tmp=new int[n];

        int idx=0;
        int k=0;
        for(int i=0; i<n;i++){
            int num=nums[i];
            if(num!=val){
                k++;
                tmp[idx++]=num;
            }
        }

        for(int j=0; j<k;j++){
            nums[j]=tmp[j];
        }

        return k;
    }
}