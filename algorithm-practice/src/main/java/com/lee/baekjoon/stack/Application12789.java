package com.lee.baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Deque<Integer> deque=new java.util.ArrayDeque<>();

        StringTokenizer st=new StringTokenizer(br.readLine());

        String ans="Nice";
        //입력받아오기
        while(st.hasMoreTokens()){
            deque.offerLast(Integer.parseInt(st.nextToken()));
        }

        //순서 할당 스택
        Stack<Integer> stack=new Stack<>();

        int temp=1;
        while(true){
            if(temp==N)break;

            if(!deque.isEmpty()&&deque.peekFirst()==temp){
                deque.pollFirst();
                temp++;
            }else if(!stack.isEmpty() && stack.peek()==temp){
                stack.pop();
                temp++;
            }//덱에도 스택에도 없으면 deque에 있는걸 stack에계속해서 보냄
            else{
                if(!stack.isEmpty()&&stack.peek()<deque.peekFirst()){
                    ans="Sad";
                    break;
                }else{
                    stack.push(deque.pollFirst());
                }
            }
        }
        System.out.println(ans);
    }
}

