import java.util.*;
class Solution {
    public String solution(String s) {
        String[]arr=s.split(" ");
        int min=Integer.parseInt(arr[0]);
        int max=Integer.parseInt(arr[0]);
        for(int i=1; i<arr.length;i++){
            int a=Integer.parseInt(arr[i]);
            min=Math.min(min,a);
            max=Math.max(max,a);
        }
        StringBuilder sb=new StringBuilder();
        sb.append(min).append(" ").append(max);
        String answer=sb.toString();
        return answer;
    }
}