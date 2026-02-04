import java.util.*;
class Solution {
    public int solution(String[] maps) {
        int answer = -1;
        
        //BFS를 총 2번할건데
        //일단 시작지점(S),레버(L), 출구(E)찾기
        int n= maps.length;
        int m=maps[0].length();
        
        int[] start=new int[2];
        int[] lever=new int[2];
        int[] end=new int[2];
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char a=maps[i].charAt(j);
                if(a=='S')start=new int[]{i,j};
                if(a=='L')lever=new int[]{i,j};
                if(a=='E')end=new int[]{i,j};
            }
        }
        
        
        //S->L
        Queue<int[]>q=new LinkedList<>();
        boolean[][] visited=new boolean[n][m];
        visited[start[0]][start[1]]=true;
        q.offer(new int[]{start[0],start[1],0});
        
        int StoL=0;
        //System.out.println("StoL");
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int row=cur[0];
            int col=cur[1];
            int cost=cur[2];
            
            //System.out.println("row : "+row+" col : "+col+" cost : "+cost);
            
            if(row==lever[0]&&col==lever[1]){
                StoL=cost;
            }
            
            //상
            if(row-1>=0&&maps[row-1].charAt(col)!='X'&&!visited[row-1][col]){
                visited[row-1][col]=true;
                q.offer(new int[]{row-1,col,cost+1});
            }
            
            //하
            if(row+1<n&&maps[row+1].charAt(col)!='X'&&!visited[row+1][col]){
                visited[row+1][col]=true;
                q.offer(new int[]{row+1,col,cost+1});
            }
            //좌
            if(col-1>=0&&maps[row].charAt(col-1)!='X'&&!visited[row][col-1]){
                visited[row][col-1]=true;
                q.offer(new int[]{row,col-1,cost+1});
            }
            //우
            if(col+1<m&&maps[row].charAt(col+1)!='X'&&!visited[row][col+1]){
                visited[row][col+1]=true;
                q.offer(new int[]{row,col+1,cost+1});
            }
        }
        System.out.println(StoL);
        
        q=new LinkedList<>();
        visited=new boolean[n][m];
        visited[lever[0]][lever[1]]=true;
        q.offer(new int[]{lever[0],lever[1],0});
        
        int LtoE=0;
        //System.out.println("LtoE");
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int row=cur[0];
            int col=cur[1];
            int cost=cur[2];
              //System.out.println("row : "+row+" col : "+col+" cost : "+cost);
            
            if(row==end[0]&&col==end[1]){
                LtoE=cost;
            }
            
            //상
            if(row-1>=0&&maps[row-1].charAt(col)!='X'&&!visited[row-1][col]){
                visited[row-1][col]=true;
                q.offer(new int[]{row-1,col,cost+1});
            }
            
            //하
            if(row+1<n&&maps[row+1].charAt(col)!='X'&&!visited[row+1][col]){
                visited[row+1][col]=true;
                q.offer(new int[]{row+1,col,cost+1});
            }
            //좌
            if(col-1>=0&&maps[row].charAt(col-1)!='X'&&!visited[row][col-1]){
                visited[row][col-1]=true;
                q.offer(new int[]{row,col-1,cost+1});
            }
            //우
            if(col+1<m&&maps[row].charAt(col+1)!='X'&&!visited[row][col+1]){
                visited[row][col+1]=true;
                q.offer(new int[]{row,col+1,cost+1});
            }
        }
        System.out.println(LtoE);
        
        
        if(LtoE==0)return-1;
        if(StoL==0)return-1;
        
        answer=LtoE+StoL;
        return answer;
    }
}