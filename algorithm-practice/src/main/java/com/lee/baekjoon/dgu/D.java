package com.lee.baekjoon.dgu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] grid = new int[N][M];
        //입력받기
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            grid[i] = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        }

        boolean a=false;
        for(int i=0;i<N-1;i++){
            for(int j=0;j<M-1;j++){
                if(grid[i][j]==1){
                    if(grid[i][j+1]==1){
                        if(grid[i+1][j]==1){
                            if(grid[i+1][j+1]==1){
                                System.out.println(1);
                                a=true;
                                break;
                            }
                        }
                    }
                }
            }
            if(a==true){
                break;
            }
        }
        if(a==false){
            System.out.println(0);
        }
    }
}
