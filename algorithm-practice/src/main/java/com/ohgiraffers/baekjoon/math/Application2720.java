package com.ohgiraffers.baekjoon.math;


import java.util.Scanner;

public class Application2720 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        //배열 초기화
        int[]Q=new int[T];//25
        int[]D=new int[T];//10
        int[]N=new int[T];//5
        int[]P=new int[T];//1

        for(int i=0;i<T;i++){
        //입력받기
            int C=sc.nextInt();
            //동전 구하기
            //쿼터
            Q[i]=C/25;
            C=C%25;

            //다임
            D[i]=C/10;
            C=C%10;
            //니켈
            N[i]=C/5;
            C=C%5;
            //페니
            P[i]=C;
        }

        //출력
        for(int i=0;i<T;i++){
            System.out.println(Q[i]+" "+D[i]+" "+N[i]+" "+P[i]);
        }
    }
}
