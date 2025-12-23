package com.lee.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());
        String str=br.readLine();
        int count=0;
        int cnt=0;
        for(int i=0;i<M-2;i++){
            if(str.charAt(i)=='I'&&
            str.charAt(i+1)=='O'&&
            str.charAt(i+2)=='I'){
                cnt++;
                if(cnt>=N){
                    count++;
                }
                i++;
            }else{
                cnt=0;
            }
        }
        System.out.println(count);



    }
}
