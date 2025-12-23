package com.lee.baekjoon.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application2667 {
    static String[][]arr;
    static boolean[][] visited;
    static int N;
    static StringBuilder sb=new StringBuilder();
    static int cnt=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        arr=new String[N][N];
        visited=new boolean[N][N];
        //배열 생성
        for(int i=0;i<N;i++){
            arr[i]=br.readLine().split("");
        }

        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(!visited[i][j]&&arr[i][j].equals("1")) {
                    dfs(i, j, 0);
                    list.add(cnt);
                    cnt=0;
                }
            }
        }
        sb.append(list.size()).append("\n");

        list.sort((a,b)->a-b);

        for(Integer i:list){
            sb.append(i).append("\n");
        }
        System.out.println(sb);


    }
    public static void dfs(int row,int col,int time){
        if(row<0||row>=arr.length||col<0||col>=arr[0].length) return;
        if(visited[row][col]||arr[row][col].equals("0")) return;

        if(arr[row][col].equals("1")&&visited[row][col]==false){
            cnt++;
            visited[row][col]=true;
        }
        dfs(row+1,col,time+1);
        dfs(row,col+1,time+1);
        dfs(row-1,col,time+1);
        dfs(row,col-1,time+1);
    }
}
