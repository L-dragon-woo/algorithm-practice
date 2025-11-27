package com.lee.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Application28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack=new Stack<>();

        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            if(a==1){
                stack.push(Integer.parseInt(st.nextToken()));
            }else if(a==2){
                if(stack.size()>0) System.out.println(stack.pop());
                else System.out.println(-1);
            }else if(a==3){
                System.out.println(stack.size());
            }else if(a==4){
                if(stack.size()>0) System.out.println(0);
                else System.out.println(1);
            }else{
                if(stack.size()>0) System.out.println(stack.peek());
                else System.out.println(-1);
            }
        }
    }
}
