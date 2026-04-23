class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        int right=str.length()-1;
        int left=0;
        
        while(left<right){
            int leftnum=str.charAt(left);
            int rightnum=str.charAt(right);
            if(leftnum!=rightnum)return false;
            left++;
            right--;
            if(left==right)return true;
        }
        return true;
    }
}