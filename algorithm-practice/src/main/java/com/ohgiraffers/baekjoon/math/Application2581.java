package com.ohgiraffers.baekjoon.math;

import java.util.Scanner;

public class Application2581 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();

        boolean isAns=false;
        int sum=0;
        int min=10001;
        for(int i=M;i<=N;i++){
            if((isPrime(i)||i==2)&&i!=1){
                sum+=i;
                min=Math.min(min,i);
                isAns=true;
            }
        }
        //답이 있다면
        if (isAns) {
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }

    }

    public static boolean  isPrime(int num){
            for(int i=2;i<(int)Math.sqrt(num)+1;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
    }
}
