package com.lee.baekjoon.combinatorics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<T;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            int M=Integer.parseInt(st.nextToken());
            //(M~N+1)!/(M-N)!
            BigInteger c=BigInteger.ONE;
            for(int j=M;j>N;j--){
                c=c.multiply(BigInteger.valueOf(j));
            }

            for(int j=1;j<=M-N;j++){
                c=c.divide(BigInteger.valueOf(j));
            }
            sb.append(c).append("\n");
        }

        System.out.println(sb);

    }

}
