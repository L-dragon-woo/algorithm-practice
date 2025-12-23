package com.lee.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Application1380 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int num=1;
        while(true){
            int n=Integer.parseInt(br.readLine());
            if(n==0) break;


            String[] arr=new String[n];
            for(int i=0;i<n;i++){
                arr[i]=br.readLine();
            }

            boolean[] boo=new boolean[n];
            for(int i=0;i<2*n-1;i++){
                String[] arr2=br.readLine().split(" ");
                int a=Integer.parseInt(arr2[0]);
                if(boo[a-1]==false){
                    boo[a-1]=true;
                }else{
                    boo[a-1]=false;
                }
            }
            for(int i=0;i<n;i++){
                if(boo[i]==true){
                    sb.append(num).append(" ").append(arr[i]).append("\n");
                }
            }
                num++;
        }
        System.out.println(sb);
    }
}
