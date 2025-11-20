package com.lee.baekjoon.number_theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Application2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] arr=new int[N];


        //입력받기
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }


        //최소간격찾기
        int[]list=new int[N-1];
        for(int i=0;i<N;i++){
            if(i==N-1){
                break;
            }else{
                list[i]=arr[i+1]-arr[i];
            }
        }

        for(int i=0;i<N-1;i++){
            if(i==N-2)break;
            list[i+1]=gcd(list[i],list[i+1]);
        }

        int ans=list[list.length-1];
        System.out.println((arr[N-1]-arr[0])/ans-(N-1));

    }

    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }else{
            return gcd(b%a,a);
        }
    }

}
