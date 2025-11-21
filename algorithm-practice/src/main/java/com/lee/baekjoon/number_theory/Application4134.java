package com.lee.baekjoon.number_theory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        long[]list=new long[T];

        for(int i=0;i<T;i++){
            long N=Long.parseLong(br.readLine());
            if(N==0 || N==1){
                list[i]=2;
            }else if(N==2){
                list[i]=2;
            }else if(N==3){
                list[i]=3;
            }else {
                for (long j = N; j <4_000_000_001L; j++) {
                    if (isPrime(j)) {
                        list[i] = j;
                        break;
                    }
                }
            }
        }

        for(Long l:list){
            System.out.println(l);
        }
    }
    public static boolean  isPrime(long num){
        for(long i=2;i*i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }


}
