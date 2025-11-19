package com.lee.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Application2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for(int i=0; i<5; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());
            int c=Integer.parseInt(st.nextToken());
            list.add(c);
            sum+=c;
        }
        list.sort((a,b)->b-a);

        System.out.println(sum/5);
        System.out.println(list.get(2));
    }
}
