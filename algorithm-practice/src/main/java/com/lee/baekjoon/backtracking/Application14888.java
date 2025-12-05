package com.lee.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Application14888 {
    static int[] arr;
    static int N;
    static int plus=0;
    static int minus=0;
    static int multiple=0;
    static int divide=0;
    static int min=MAX_VALUE;
    static int max=MIN_VALUE;
    static int score;

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         N= Integer.parseInt(br.readLine());
        arr=new int[N];
        StringTokenizer st1=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st1.nextToken());
        }
        score+=arr[0];

        StringTokenizer st=new StringTokenizer(br.readLine());
        plus=Integer.parseInt(st.nextToken());

        minus=Integer.parseInt(st.nextToken());

        multiple=Integer.parseInt(st.nextToken());

        divide=Integer.parseInt(st.nextToken());

        backtrack(score,1);

        System.out.println(max);
        System.out.println(min);
    }

    public static void backtrack(int score,int depth){
       if(depth==N){
           max=Math.max(max,score);
           min=Math.min(min,score);
           return;
       }

       if(plus>0){
           plus--;
           backtrack(score+arr[depth],depth+1);
           plus++;
       }

       if(minus>0){
           minus--;
           backtrack(score-arr[depth],depth+1);
           minus++;
       }

       if(multiple>0){
           multiple--;
           backtrack(score*arr[depth],depth+1);
           multiple++;
       }

       if(divide>0){
           divide--;
           backtrack(score/arr[depth],depth+1);
           divide++;
       }

    }
}
