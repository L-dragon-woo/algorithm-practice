package com.lee.baekjoon.dfs;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Application21736 {
    static boolean[][] visited;
    static String[][] arr;
    static int X;
    static int Y;
    static int cnt=0;
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        arr=new String[N][M];
        visited=new boolean[N][M];

        //입력받기
        for(int i=0;i<N;i++){
            String str=br.readLine();
            for(int j=0;j<M;j++){
                String a=str.substring(j,j+1);
                if(a.equals("I")){
                    X=i;
                    Y=j;
                }else if(a.equals("X")){
                    visited[i][j]=true;
                }
                arr[i][j]=a;
            }
        }
        dfs(X,Y);
        if(cnt==0) System.out.println("TT");
        else{
            System.out.println(cnt);
        }

    }

    public static void dfs(int x,int y){
        if(x<0||x>=arr.length||y<0||y>=arr[0].length) return;
        if(visited[x][y]) return;
        visited[x][y]=true;
        if(arr[x][y].equals("P"))cnt++;
        dfs(x+1,y);
        dfs(x,y+1);
        dfs(x-1,y);
        dfs(x,y-1);
    }
}
