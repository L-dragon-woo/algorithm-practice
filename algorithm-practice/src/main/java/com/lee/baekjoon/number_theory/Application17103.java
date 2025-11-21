package com.lee.baekjoon.number_theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N=Integer.parseInt(br.readLine());
            int cnt=0;
            for(int j=2;j<=N/2;j+=2){
                if(isPrime(j)){
                    if(isPrime(N-j)){
                      cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);

    }
    public static boolean isPrime(int n){
        for(int i=2; i<(int)Math.sqrt(n)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
