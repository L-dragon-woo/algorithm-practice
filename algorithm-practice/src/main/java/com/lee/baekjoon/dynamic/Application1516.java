package com.lee.baekjoon.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Application1516 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());
        boolean[] visited=new boolean[N+1];
        int s=0;
        StringBuilder sb=new StringBuilder();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=1;i<=N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            map.put(i,a);//1 10
            while(st.hasMoreTokens()){
                int b=Integer.parseInt(st.nextToken());
                if(b==-1){
                    s+=b;
                    break;
                }else{
                    map.put(i,map.get(i)+map.get(b));
                }
            }
        }
    }
}
