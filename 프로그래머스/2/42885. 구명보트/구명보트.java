import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer=0;
        int lp=0;
        int rp=people.length-1;
        
         while (lp <= rp) {
            if (people[lp] + people[rp] <= limit) {
                lp++;
            }
            rp--;
            answer++;
        }
        return answer;
    }
}