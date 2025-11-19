package com.ohgiraffers.baekjoon.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Application1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map=new HashMap<>();
        Map<Integer,String> map1=new HashMap<>();
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());



        ArrayList<String> list=new ArrayList<>();
        //입력받기
        for(int i=1;i<=N;i++){
            String n=br.readLine();
            map.put(n,i);
            map1.put(i,n);
        }
        for(int i=0;i<M;i++){
            String m=br.readLine();
            if(map.containsKey(m)){
                list.add(String.valueOf(map.get(m)));
            }else{
                list.add(String.valueOf(map1.get(Integer.parseInt(m))));
            }
        }

        for(String s:list){
            System.out.println(s);
        }





    }
}
