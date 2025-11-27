package com.lee.baekjoon.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Application28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());

        Deque<Integer> deque=new ArrayDeque<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            if(a==1){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }else if(a==2){
                deque.addLast(Integer.parseInt(st.nextToken()));
            }else if(a==3){
                if(deque.isEmpty())sb.append("-1\n");
                else sb.append(deque.pollFirst()+"\n");
            }else if(a==4){
                if(deque.isEmpty())sb.append("-1\n");
                else sb.append(deque.pollLast()+"\n");
            }else if(a==5){
                sb.append(deque.size()+"\n");
            }else if(a==6){
                if(deque.isEmpty())sb.append("1\n");
                else sb.append("0\n");
            }else if(a==7){
                if(deque.isEmpty())sb.append("-1\n");
                else sb.append(deque.peekFirst()+"\n");
            }else if(a==8){
                if(deque.isEmpty())sb.append("-1\n");
                else sb.append(deque.peekLast()+"\n");
            }
        }
        System.out.println(sb);

    }

}
