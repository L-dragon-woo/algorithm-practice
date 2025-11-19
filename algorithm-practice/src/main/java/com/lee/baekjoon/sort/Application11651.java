package com.lee.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Application11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());
        ArrayList<int[]> list=new ArrayList<>();

        for(int i=0;i<N;i++){
            StringTokenizer st1=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st1.nextToken());
            int b=Integer.parseInt(st1.nextToken());
            list.add(new int[]{a,b});
        }

        list.sort((o1, o2) -> {
            if (o1[1] != o2[1]) return o1[1] - o2[1];  // 첫 번째 값 기준
            return o1[0] - o2[0];                      // 두 번째 값 기준
        });

        for(int[] ints:list){
            System.out.println(ints[0]+" "+ints[1]);
        }
    }
}
