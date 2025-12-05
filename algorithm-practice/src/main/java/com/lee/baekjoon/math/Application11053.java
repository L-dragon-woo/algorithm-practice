package com.lee.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int start=Integer.parseInt(st.nextToken());
        int cnt=1;
        while(st.hasMoreTokens()){
            int a=Integer.parseInt(st.nextToken());
            if (start < a) {
                cnt++;
                start=a;
            }
        }
        System.out.println(cnt);
    }
}
