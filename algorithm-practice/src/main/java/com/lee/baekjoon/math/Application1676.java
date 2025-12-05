package com.lee.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Application1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BigInteger a=new BigInteger(br.readLine());
        BigInteger b=factorial(a);
        BigInteger c=BigInteger.TEN;
        int cnt=0;
        while(true){
            if(b.mod(c).equals(BigInteger.ZERO)){
                cnt++;
                c=c.multiply(BigInteger.valueOf(10));
            }else{
                System.out.println(cnt);
                break;
            }
        }

    }
    public static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        }else{
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
