package com.ohgiraffers.baekjoon.math;

import java.util.Scanner;

public class Application2745 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String N=sc.next();
        Double a=sc.nextDouble();
        long sum=0;
        long tmp=1;
        double j=0;

        for(int i=N.length()-1;i>=0;i--){
            //65 ~ 90
            tmp=(long)Math.pow(a,j++);

            char c=N.charAt(i);
            int num;

            if(c>='A' && c<='Z'){
                num=(int)(c-55);

            }else{
                num=(int)(c-48);
            }

            sum+=num*tmp;

        }

        System.out.println(sum);

    }
}
