package com.lee.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Application10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int K=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();

        int cnt=0;
        for(int i=0;i<K;i++){
            int N=Integer.parseInt(br.readLine());
            if(N==0){
                if(!stack.isEmpty()){
                    cnt-=stack.pop();
                }
            }else{
                stack.push(N);
                cnt+=N;
            }
        }
        System.out.println(cnt);
    }
}
