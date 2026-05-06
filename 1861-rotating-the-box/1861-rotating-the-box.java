import java.util.*;
class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length;
        int m=boxGrid[0].length;
        for(int i=0; i<n;i++){
            Deque<Character>dq=new LinkedList<>();
            Deque<Character>dq1=new LinkedList<>();
            for(int j=0;j<m;j++){
                char c=boxGrid[i][j];
                if(c=='#'){
                    dq.offerLast(c);
                }
                else if(c=='*'){
                    int a=j-1;
                    while(!dq.isEmpty()){
                        boxGrid[i][a]=dq.pollLast();
                        a--;
                    }
                    int aa=a;
                    while(!dq1.isEmpty()){
                        boxGrid[i][aa]=dq1.pollLast();
                        aa--;
                    }
                }else if(c=='.'){
                    dq1.offerLast(c);
                }
            }
            int b=m-1;
            while(!dq.isEmpty()){
                boxGrid[i][b]=dq.pollLast();
                b--;
            }
            int bb=b;
            while(!dq1.isEmpty()){
                boxGrid[i][bb]=dq1.pollLast();
                bb--;
            }
        }

        char[][] ans = new char[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][n - 1 - i] = boxGrid[i][j];
            }
        }
        return ans;
    }
}