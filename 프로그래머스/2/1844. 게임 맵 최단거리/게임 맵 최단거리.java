import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        
        int M=maps[0].length;
        int N=maps.length;
        
        int answer=M*N;
        
        boolean[][] visited=new boolean[N][M];
        Queue<int[]>queue=new LinkedList<>();
        queue.offer(new int[]{0,0,0});//초기 시작점
        visited[0][0]=true;
    while(!queue.isEmpty()){
        int[] cur=queue.poll();
        int row=cur[0];
        int col=cur[1];
        int distance=cur[2];
        
        
        if(row==N-1 && col==M-1){
            answer=Math.min(answer,distance);
            break;
        }
        
        //상
        if(row-1>=0&&row-1<N&&maps[row-1][col]!=0&&!visited[row-1][col]){
            int d=distance;
            d++;
            queue.offer(new int[]{row-1,col,d});
            visited[row-1][col]=true;
        }
        
        //하
        if(row+1>=0&&row+1<N&&maps[row+1][col]!=0&&!visited[row+1][col]){
            int d=distance;
            d++;
            queue.offer(new int[]{row+1,col,d});
            visited[row+1][col]=true;
        }
        
        //좌
        if(col-1>=0&&col-1<M&&maps[row][col-1]!=0&&!visited[row][col-1]){
            int d=distance;
            d++;
            queue.offer(new int[]{row,col-1,d});
            visited[row][col-1]=true;
        }
        
        //우
        if(col+1>=0&&col+1<M&&maps[row][col+1]!=0&&!visited[row][col+1]){
            int d=distance;
            d++;
            queue.offer(new int[]{row,col+1,d});
            visited[row][col+1]=true;
        }
    
    }
        
        if(answer==M*N){
            return -1;
        }else{
            answer++;
            return answer;
        }
    }
}