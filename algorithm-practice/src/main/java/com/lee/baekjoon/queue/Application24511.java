package com.lee.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque=new LinkedList<>();

        int N=Integer.parseInt(br.readLine());
        int[] arr=new int[N];
        arr=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] arr1=new int[N];
        arr1=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i=0;i<N;i++){
            if(arr[i]==0){
                deque.offerLast(arr1[i]);
            }
        }

        int M=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        StringBuilder sb=new StringBuilder();
        while(st.hasMoreTokens()){
            int a=Integer.parseInt(st.nextToken());
            deque.offerFirst(a);
            sb.append(deque.pollLast()+" ");
        }
        System.out.println(sb);

    }
}
