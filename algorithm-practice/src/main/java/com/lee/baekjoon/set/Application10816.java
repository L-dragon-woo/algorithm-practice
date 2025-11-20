package com.lee.baekjoon.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class Application10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        int N=Integer.parseInt(br.readLine());

        ConcurrentHashMap<Integer,Integer> map=new ConcurrentHashMap<>();

        StringTokenizer st1=new StringTokenizer(br.readLine());

        while(st1.hasMoreTokens()){
            int n=Integer.parseInt(st1.nextToken());
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }

        int M=Integer.parseInt(br.readLine());


        ArrayList<Integer> ans=new ArrayList<>();

        StringTokenizer st3=new StringTokenizer(br.readLine());
        while(st3.hasMoreTokens()){
            int m=Integer.parseInt(st3.nextToken());
            if(map.containsKey(m)){
                ans.add(map.get(m));
            }else{
                ans.add(0);
            }
        }

        for(int i:ans){
            System.out.print(i+" ");
        }



    }
}
