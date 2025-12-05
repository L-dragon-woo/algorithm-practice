package com.lee.baekjoon.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int max=0;
        StringBuilder sb=new StringBuilder();
        int[][]arr=new int[41][2];
        //초기설정
        arr[0][0]=1;
        arr[0][1]=0;
        arr[1][0]=0;
        arr[1][1]=1;

        for(int i=0;i<N;i++){
            int a=Integer.parseInt(br.readLine());
            if (a == 0) {
                sb.append(arr[a][0]+" "+arr[a][1]+"\n");
            }else if(a==1){
                sb.append(arr[a][0]+" "+arr[a][1]+"\n");
            }else{
                for(int j=2;j<=a;j++) {
                    arr[j][0] = arr[j - 1][0] + arr[j - 2][0];
                    arr[j][1] = arr[j - 1][1] + arr[j - 2][1];
                    if(j==a) sb.append(arr[a][0] + " " + arr[a][1] + "\n");
                }
            }
        }



        System.out.println(sb);
    }

}
