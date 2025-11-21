package com.lee.baekjoon.math;

import java.util.Scanner;

public class Application2501 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();

        //약수의 갯수를 세기 위한 cnt 선언
        int cnt=0;
        for(int i=1;i<=N;i++){
            //약수를 찾으면
            if(N%i==0){
                cnt++;
            }
            //약수의 갯수와 K가 일치한다면
            if(cnt==K){
                //약수를 출력
                System.out.println(i);
                //종료
                break;
            }
        }
        //만약 cnt가 K보다 적다면 0을 출력
        if(cnt<K){
            System.out.println(0);
        }

    }
}
