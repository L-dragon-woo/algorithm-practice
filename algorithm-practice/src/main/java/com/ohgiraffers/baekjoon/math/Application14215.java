package com.ohgiraffers.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Application14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());

        ArrayList<Integer> list=new ArrayList<>();

        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }

        //제일 긴 변을 구하기
        int max=Math.max(list.get(2),Math.max(list.get(0),list.get(1)));
        //나머지 변의 길이 합 구하기
        int len=list.get(0)+list.get(1)+list.get(2)-max;

        if(max<len){
            System.out.println(list.get(0)+list.get(1)+list.get(2));
        }else if(max==len){
            System.out.println(max*2-1);
        }else if(max>len){
            System.out.println(len*2-1);
        }





    }



}
