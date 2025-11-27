package com.lee.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Application20920 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<N;i++){
            String a=br.readLine();

            if(a.length()>=M){
              if(map.containsKey(a)){
                  map.put(a,map.get(a)+1);
              }else{
                  map.put(a,1);
              }
            }
        }
        //1. 자주 나오는 단어(내림차순)
        //2. 해당 단어의 길이(내림차순)
        //3. 알파벳 사전순으로 앞에 배치(오름차순)
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            // 1. 빈도 내림차순
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            // 2. 길이 내림차순
            if (a.getKey().length() != b.getKey().length()) {
                return b.getKey().length() - a.getKey().length();
            }
            // 3. 알파벳 오름차순
            return a.getKey().compareTo(b.getKey());
        });

        System.out.println(list.stream().map(Map.Entry::getKey).collect(Collectors.joining("\n")));




    }
}
