import java.util.*;
class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;

        if(n==1 && m==1) return 0;

        int[] arr=new int[n*m];
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx]=grid[i][j];
                idx++;
            }
        }

        Arrays.sort(arr);
        
        int std=arr[(n*m)/2];
        int ans=0;

        int N=arr.length;
        for(int i=0; i<N;i++){
            if(Math.abs(arr[i]-std)%x!=0)return -1;
            ans+=Math.abs(arr[i]-std)/x;
        }
        return ans;


    }
}