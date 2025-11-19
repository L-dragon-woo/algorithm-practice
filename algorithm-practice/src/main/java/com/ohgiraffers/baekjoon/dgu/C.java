package com.ohgiraffers.baekjoon.dgu;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int P=sc.nextInt();
        int M=sc.nextInt();
        int C=sc.nextInt();
        int X=sc.nextInt();

        long min=1000000001l;
        //피자 고르는 경우
        for(int i=1; i<=P;i++){
            //막국수 고르는 경우
            for(int j=1; j<=M;j++){
                //치킨 고르는 경우
                for(int k=1; k<=C;k++){
                    min=Math.min(min,Math.abs((i+j)*(j+k)-X));
                }
            }
        }
        System.out.println(min);
    }
}
