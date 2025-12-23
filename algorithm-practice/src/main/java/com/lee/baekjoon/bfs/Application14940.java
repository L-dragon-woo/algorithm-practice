package com.lee.baekjoon.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Application14940 {
    static int[][]arr;
    static boolean[][]visited;
    static int x;
    static int y;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        arr=new int[n][m];
        visited=new boolean[n][m];

        for(int i=0;i<n;i++){
           StringTokenizer st2=new StringTokenizer(br.readLine());
           int j=0;
           while(st2.hasMoreTokens()){
               int a=Integer.parseInt(st2.nextToken());
               if(a==2){
                   x=i;
                   y=j;
               }
               if(a==1) {
                   arr[i][j] = -1;
               }else{
                   arr[i][j]=a;
               }
               j++;
           }
        }

        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{x,y,0});
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int X=cur[0];
            int Y=cur[1];
            int time=cur[2];
            if(X<0||Y<0||X>=n||Y>=m)continue;
            if(visited[X][Y])continue;
            if(arr[X][Y]==0)continue;
            arr[X][Y]=time;
            visited[X][Y]=true;
            time++;
            q.offer(new int[]{X+1,Y,time});
            q.offer(new int[]{X-1,Y,time});
            q.offer(new int[]{X,Y+1,time});
            q.offer(new int[]{X,Y-1,time});
        }


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
