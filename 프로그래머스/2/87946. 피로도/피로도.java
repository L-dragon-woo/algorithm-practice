import java.util.*;
class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        Arrays.sort(dungeons,(a,b)->a[0]-b[0]);
        
        System.out.println(Arrays.deepToString(dungeons));
        
        
        return answer;
    }
}