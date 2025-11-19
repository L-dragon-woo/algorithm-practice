package com.ohgiraffers.baekjoon.queue;

import java.util.*;

public class Application1158 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        Queue<Integer> queue=new LinkedList<>();
        String str="<";
        for(int i=1;i<n+1;i++){
            queue.add(i);
        }
        while(!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());

            }
            if(queue.size()>1) {
                str += queue.poll() + ", ";
            }else{
                str+=queue.poll()+">";
            }
        }
        System.out.println(str);

    }
}
