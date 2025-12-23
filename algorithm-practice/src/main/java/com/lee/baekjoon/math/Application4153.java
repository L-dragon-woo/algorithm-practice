package com.lee.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int N1=(int)Math.pow(Integer.parseInt(st.nextToken()),2);
            int N2=(int)Math.pow(Integer.parseInt(st.nextToken()),2);
            int N3=(int)Math.pow(Integer.parseInt(st.nextToken()),2);

            if(N1==0 && N2==0 && N3==0){
                break;
            }

            if((N1==(N2+N3)) || (N2==(N1+N3)) || (N3==(N1+N2))){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }


        }
    }
}
