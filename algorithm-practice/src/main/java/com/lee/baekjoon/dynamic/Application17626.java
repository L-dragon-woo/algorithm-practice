package com.lee.baekjoon.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[]arr=new int[50001];
        for(int i=1;i<=50000;i++){
            arr[i]=i;
        }
        int N=Integer.parseInt(br.readLine());
//12 3
        for(int i=1;i<N+1;i++){//1~12
            for(int j=1;j<i+1;j++){
                int val=j*j;
                if(val>i){
                    break;
                }
                arr[i]=Math.min(arr[i],arr[i-val]+1);
            }
        }
        System.out.println(arr[N]);
    }
}
