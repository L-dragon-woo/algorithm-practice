package com.ohgiraffers.baekjoon.stack;

import java.util.*;

public class Application10828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        Deque deque=new ArrayDeque();

        int n=scanner.nextInt();


       for(int i=0;i<n;i++){
           String str=scanner.next();
           if(str.equals("pop")){
               if(stack.empty()){
                   deque.addFirst(-1);
                   continue;
               }
               deque.addFirst(stack.pop());
           }else if(str.equals("push")){
               stack.push(scanner.nextInt());
           }else if(str.equals("size")){
               deque.addFirst(stack.size());
           }else if(str.equals("empty")){
               deque.addFirst(stack.empty() ? 1 : 0);
           }else if(str.equals("top")){
               if(stack.empty()){
                   deque.addFirst(-1);
                   continue;
               }
               deque.addFirst(stack.peek());
           }
       }

       for(int i=deque.size()-1;i>=0;i--){
           System.out.println(deque.pollLast());
       }



    }
}
