import java.util.*;
class Solution {
    public void rotate(int[][] matrix) {
    Deque<Integer>dq=new LinkedList<>();
    
    int n=matrix.length;
    for(int i=0;i<n;i++){
        for(int j=n-1;j>=0; j--){
            dq.offerLast(matrix[j][i]);
        }
    }

    for(int i=0; i<n;i++){
        for(int j=0; j<n; j++){
            matrix[i][j]=dq.pollFirst();
        }
    }



    }
}