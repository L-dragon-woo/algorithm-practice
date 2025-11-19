package com.lee.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Application25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());

        ArrayList<Integer> list=new ArrayList<>();
        StringTokenizer st1=new StringTokenizer(br.readLine());

        while(st1.hasMoreTokens()){
            list.add(Integer.parseInt(st1.nextToken()));
        }

        list.sort((a,b)->(b-a));
        System.out.println(list.get(k-1));

    }
}
