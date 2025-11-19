package com.lee.baekjoon.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class Application1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //N,M 받기
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        HashSet<Integer>set=new HashSet<>();

        StringTokenizer st1=new StringTokenizer(br.readLine());

        //처음 집합 저장
        while(st1.hasMoreTokens()){
            set.add(Integer.parseInt(st1.nextToken()));
        }

        StringTokenizer st2=new StringTokenizer(br.readLine());

        while(st2.hasMoreTokens()){
            int a=Integer.parseInt(st2.nextToken());
            if(set.contains(a)){
                set.remove(a);
            }else{
                set.add(a);
            }
        }
        System.out.println(set.size());
    }
}
