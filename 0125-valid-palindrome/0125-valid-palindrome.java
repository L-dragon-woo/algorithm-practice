import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        //하나의 문자열로 만들기
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toUpperCase().toCharArray()) {
            if (ch >= 'A' && ch <= 'Z' || ch>='0'&& ch<='9') {
            sb.append(ch);
            }
        }

        String a = sb.toString();

        boolean ans=true;
        
        int m=a.length();

        int left=0;

        int right=m-1;

        while(left<right){
            char l=a.charAt(left);
            char r=a.charAt(right);
            if(l==r){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;

    }
}