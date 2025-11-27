package com.lee.baekjoon.combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        if(N==0){
            System.out.println(1);
        }else{
            int c=1;
            for(int i=2;i<=N;i++){
                c*=i;
            }
            System.out.println(c);
        }
    }
}
