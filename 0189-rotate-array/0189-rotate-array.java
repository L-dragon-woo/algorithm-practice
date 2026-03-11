import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] nums1 = new int[n];

        for(int i=0; i<n; i++){
            nums1[(i + k) % n] = nums[i];
        }

        for(int i=0;i<n;i++){
            nums[i] = nums1[i];
        }
    }
}