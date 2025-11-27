package com.lee.baekjoon.math;

import java.util.Scanner;

public class Application9063 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int Xmax=-10001;
        int Ymax=-10001;
        int Xmin=10001;
        int Ymin=10001;

        int x=Integer.MIN_VALUE;

        //입력 받기
        for(int i=0;i<N;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();// 20 24 // 40 21 // 10 12
            Xmax=Math.max(Xmax,a);//Xmax=20 //40// 40
            Ymax=Math.max(Ymax,b);//Ymax=24 //24//24
            Xmin=Math.min(Xmin,a);//Xmin=20 //20//10
            Ymin=Math.min(Ymin,b);//Ymin=24 //21//12
            //30 * 12
        }

        System.out.println((Xmax-Xmin)*(Ymax-Ymin));

    }
}
