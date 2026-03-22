import java.util.*;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);//0 1 3 5 6
        int n=citations.length;
        int rank=1;
        for(int i=n-1; i>=0;i--){
            int num=citations[i];
            if(rank>num)break;
            rank++;
        }
        rank--;
        return rank;

    }
}