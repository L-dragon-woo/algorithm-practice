class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int n=arr1.length;//3
        int m=arr2[0].length;
    
        int[][]ans=new int[n][m];
        for(int i=0;i<n;i++){
            int[]a=arr1[i];
            for(int j=0;j<m;j++){
                ans[i][j]=sol(a,arr2,j);
            }
        }
        
        answer=ans;
        return answer;
    }
    private int sol(int[] a,int[][]arr2,int idx){//[1,4] arr2, 0
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i]*arr2[i][idx];
        }
        
        return sum;
    }
}