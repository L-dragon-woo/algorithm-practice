import java.util.*;
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;

        while(i<n1&&j<n2){
            int num1=nums1[i];
            int num2=nums2[j];
            if(num1==num2){
                return num1;
            }else if(num1>num2){
                j++;
            }else{
                i++;
            }
        }
        return -1;
    }
}