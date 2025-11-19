package com.lee.baekjoon.number_theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        //분자
        int a1=Integer.parseInt(st.nextToken());
        //분모
        int a2=Integer.parseInt(st.nextToken());
        StringTokenizer st1=new StringTokenizer(br.readLine());
        //분자
        int b1=Integer.parseInt(st1.nextToken());
        //분모
        int b2=Integer.parseInt(st1.nextToken());

        //분모의 최소공배수 구하기
        //최종분모
        int lcm=a2*b2/gcd(a2,b2);
        a1*=lcm/a2;
        b1*=lcm/b2;

        //마지막 분모와 분자에 대해서 최대공약수를 구해서 나눠준다.
        //최종분자
        int num=a1+b1;

        int n=gcd(lcm,num);
        //기약분수를 만드려면 분모, 분자의 최대공약수를 구해서 각각 나눠주면 된다.
        System.out.println((num/n)+" "+(lcm/n));

    }

    public static int gcd(int a,int b){
       if(a==0){
           return b;
       }else{
           return gcd(b%a,a);
       }
    }

}
