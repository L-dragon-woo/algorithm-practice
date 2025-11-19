package com.lee.baekjoon.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Application10845 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Deque<Integer> deque=new ArrayDeque<>();
        Stack<Integer> ans=new Stack<>();

        for (int i=0;i<n;i++){
            String str=sc.next();
            if(str.equals("push")){
                deque.addLast(sc.nextInt());
            }else if(str.equals("pop")){
                if(deque.isEmpty()){
                    ans.push(-1);
                    continue;
                }
                ans.push(deque.removeFirst());
            }else if(str.equals("size")){
                ans.push(deque.size());
            }else if(str.equals("empty")){
                ans.push(deque.isEmpty() ? 1 : 0);
            }else if(str.equals("front")){
                if(deque.isEmpty()){
                    ans.push(-1);
                    continue;
                }
                ans.push(deque.peekFirst());
            }else if(str.equals("back")){
                if(deque.isEmpty()){
                    ans.push(-1);
                    continue;
                }
                ans.push(deque.peekLast());
            }
        }

        for(Integer i:ans){
            System.out.println(i);
        }
    }
}
