package com.lee.baekjoon.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Application11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String a=st.nextToken();
            if(a.equals("add")){
                set.add(Integer.parseInt(st.nextToken()));

            }else if(a.equals("remove")){
                set.remove(Integer.parseInt(st.nextToken()));

            }else if(a.equals("check")){
                int num=Integer.parseInt(st.nextToken());
                if(set.contains(num)) sb.append("1").append("\n");
                else sb.append("0").append("\n");

            }else if(a.equals("toggle")){
                int num=Integer.parseInt(st.nextToken());
                if(set.contains(num)) set.remove(num);
                else set.add(num);

            }else if(a.equals("all")){
               for(int k=1; k<21;k++){
                   set.add(k);
               }
            }else if(a.equals("empty")){
                set.clear();
            }
        }

        System.out.println(sb);
    }
}
