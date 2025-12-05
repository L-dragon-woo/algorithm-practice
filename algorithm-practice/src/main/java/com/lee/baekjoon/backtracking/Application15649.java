package com.lee.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application15649 {
    static int N;
    static int M;
    static boolean[] visited;
    static StringBuilder sb=new StringBuilder();
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        visited=new boolean[N];
        arr=new int[M];

        backtracking(0);
        System.out.println(sb);

    }
    public static void backtracking(int depth){

        if(depth==M){
            for(int i=0;i<M;i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0;i<N;i++){
            if(!visited[i]){
                visited[i]=true;
                arr[depth]=i+1;
                backtracking(depth+1);
                visited[i]=false;
            }
        }
    }
}
