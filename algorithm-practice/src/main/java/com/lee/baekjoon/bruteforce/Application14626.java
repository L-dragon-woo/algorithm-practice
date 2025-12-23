package com.lee.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[]arr;
        arr=br.readLine().split("");
        int num=0;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].equals("*")){
                num=i;
            }else{
                //짝수의 경우
                if(i%2==0){
                  sum+=Integer.parseInt(arr[i]);
                }else{
                    //홀수의 경우
                    sum+=Integer.parseInt(arr[i])*3;
                }

            }
        }
        int m=Integer.parseInt(arr[arr.length-1]);

        for(int i=0; i<10;i++){
            int tmp=sum;
            if(num%2==0){
                tmp+=i;
            }else{
                tmp+=i*3;
            }

            if(m==(10-(tmp%10))%10){
                System.out.println(i);
            }
        }
    }
}
