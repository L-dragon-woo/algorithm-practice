import java.util.*;

class Solution {
    public int solution(String[] board) {
        //R,G의 위치를 찾기
        int[] red=new int[2];
        int[] green=new int[2];
        int n=board.length;
        int m=board[0].length();
        
        for(int i=0; i<n;i++){
            String bo=board[i];
            for(int j=0;j<m;j++){
                String b=bo.substring(j,j+1);
                if(b.equals("R")){
                    red=new int[]{i,j};
                }else if(b.equals("G")){
                    green=new int[]{i,j};
                }
            }
        }
        //R부터 G까지 BFS
        boolean[][]visited=new boolean[n][m];
        Queue<int[]>queue=new LinkedList<>();
        int r=red[0];
        int c=red[1];
        queue.offer(new int[]{r,c,0});
        visited[r][c]=true;
        int answer = -1;
        while(!queue.isEmpty()){
            int[] cur=queue.poll();
            int rrow=cur[0];
            int ccol=cur[1];
            int cost=cur[2];
            if((rrow==green[0])&&(ccol==green[1])){
                answer=cost;
                return answer;
            }
            //상
            int row=rrow;
            int col=ccol;
            if(row-1>=0&&!board[row-1].substring(col,col+1).equals("D")){
            while(true){
                if(row<0){
                    if(!visited[row+1][col]){
                    visited[row+1][col]=true;
                    queue.offer(new int[]{row+1,col,cost+1});
                    }
                    break;
                }
                if(board[row].substring(col,col+1).equals("D")){
                    if(!visited[row+1][col]){
                    visited[row+1][col]=true;
                    queue.offer(new int[]{row+1,col,cost+1});
                    }
                    break;
                }
                row--;
            }
            }
            //하
            row=rrow;
            col=ccol;
            if(row+1<n&&!board[row+1].substring(col,col+1).equals("D")){
            while(true){
                if(row>n-1){
                    if(!visited[row-1][col]){
                        visited[row-1][col]=true;
                        queue.offer(new int[]{row-1,col,cost+1});
                    }
                    break;
               }
                if(board[row].substring(col,col+1).equals("D")){
                    if(!visited[row-1][col]){
                        visited[row-1][col]=true;
                        queue.offer(new int[]{row-1,col,cost+1});
                    }
                        break;
                }
                row++;
            }
            }
            //좌
            row=rrow;
            col=ccol;
            if(col-1>=0&&!board[row].substring(col-1,col).equals("D")){
            while(true){
                if(col<0){
                    if(!visited[row][col+1]){
                    visited[row][col+1]=true;
                    queue.offer(new int[]{row,col+1,cost+1});
                    }
                    break;
                }
                if(board[row].substring(col,col+1).equals("D")){
                    if(!visited[row][col+1]){
                    visited[row][col+1]=true;
                    queue.offer(new int[]{row,col+1,cost+1});
                    }
                        break;
                }
                col--;
            }
            }
            //우
            row=rrow;
            col=ccol;
            if(col+1<m&&!board[row].substring(col+1,col+2).equals("D")){
            while(true){
                if(col>m-1){
                    if(!visited[row][col-1]){
                        visited[row][col-1]=true;
                        queue.offer(new int[]{row,col-1,cost+1});
                    }
                    break;
                           }
                if(board[row].substring(col,col+1).equals("D")){
                    if(!visited[row][col-1]){
                        visited[row][col-1]=true;
                        queue.offer(new int[]{row,col-1,cost+1});
                    }
                    break;
                }
                col++;
            }
            }
        }
        
        
        
        return answer;
    }
}