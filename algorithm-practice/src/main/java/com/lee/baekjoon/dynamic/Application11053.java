package com.lee.baekjoon.dynamic;

import java.io.*;
import java.util.StringTokenizer;

public class Application11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine());

        int[] arr=new int[N];
        int[] arrr=new int[N];

        arrr[N-1]=1;
        //배열생성
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int a=arr[N-1];

        if(N>=2) {
            //뒤에서 앞으로
            for (int i = N - 2; i >= 0; i--) {
                if (a >= arr[i]) {
                    a = arr[i];
                    arrr[i] = arrr[i+1] + 1;
                } else {
                    arrr[i] = arrr[i+1];
                }

            }
            int back=arrr[0];

            //앞에서 뒤로
            arrr=new int[N];
            arrr[0]=1;
            int b=arr[0];

            for(int i=1;i<N;i++){
                if(b<=arr[i]){
                    b=arr[i];
                    arrr[i]=arrr[i-1]+1;
                }else{
                    arrr[i]=arrr[i-1];
                }
            }
            int front=arrr[N-1];

            System.out.println(Math.max(back,front));

        }else{
            System.out.println(1);
        }
    }

}
