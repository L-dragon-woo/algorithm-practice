package com.lee.baekjoon.reflexive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long N=Long.parseLong(br.readLine());
        System.out.println(factorial(N));

    }

    public static long factorial(long n){
        if(n==1 || n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
