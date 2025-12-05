package com.lee.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application14889 {
    static int[][] arr;
    static int min=Integer.MAX_VALUE;
    static int N;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        arr=new int[N][N];
        visited=new boolean[N+1];

        //배열 설정
        for(int i=0;i<N;i++){
           StringTokenizer st=new StringTokenizer(br.readLine());
           while(st.hasMoreTokens()){
               arr[i][N-st.countTokens()]=Integer.parseInt(st.nextToken());
           }
        }

        //배열 누적합
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                arr[i][j]+=arr[j][i];
            }
        }
        startlink(1,0);
        System.out.println(min);
    }



    public static void startlink(int startidx,int depth){
        if(depth==N/2){
            //이제 visited[]가 true인 값을 계산하고
            int t=cal(true);
            //이제 visited[]가 false인 값을 계산하고
            int f=cal(false);
            min=Math.min(min,Math.abs(t-f));
        return;
        }
        for(int i=startidx;i<=N;i++){
            if(!visited[i]){
                visited[i]=true;
                startlink(i,depth+1);
                visited[i]=false;
            }
        }

    }

    public static int cal(boolean bool){
        int [] temp=new int[N/2];
        int idx=0;
        for(int i=1;i<=N;i++){
            if(visited[i]==bool){
            temp[idx]=i;
            idx++;
            }
        }
        int score=0;
        for(int i=0;i<temp.length;i++){
            for(int j=i+1;j<temp.length;j++){
                score+=arr[temp[i]-1][temp[j]-1];
            }
        }

        return score;

    }
}
