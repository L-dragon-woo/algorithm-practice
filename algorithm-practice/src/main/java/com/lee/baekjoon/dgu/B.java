package com.lee.baekjoon.dgu;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int N=sc.nextInt();
        int cnt=0;
        for(int i=0;i<N;i++){
            int s=sc.nextInt();
            int c=sc.nextInt();
            int a=sc.nextInt();
            int r=sc.nextInt();
            if(s>=1000){
                cnt++;
            }else if(c>=1600){
                cnt++;
            }else if(a>=1500){
                cnt++;
            }else if(r<=30 && r>0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
