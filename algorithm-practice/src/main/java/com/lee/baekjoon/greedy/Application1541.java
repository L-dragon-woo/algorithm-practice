package com.lee.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // '-' 로 분리
        String[]arr=br.readLine().split("-");
       //55  55+40
        // `+`로 분리
        for(int i=0;i<arr.length;i++){
            StringTokenizer st=new StringTokenizer(arr[i],"+");
            int sum=0;
            while(st.hasMoreTokens()){
                sum+=Integer.parseInt(st.nextToken());
            }
            arr[i]=String.valueOf(sum);
        }


        int a=Integer.parseInt(arr[0]);
        for(int i=1;i<arr.length;i++){
            a-=Integer.parseInt(arr[i]);
        }
        System.out.println(a);

    }

}
