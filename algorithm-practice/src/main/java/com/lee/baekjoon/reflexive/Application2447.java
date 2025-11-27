package com.lee.baekjoon.reflexive;

import java.io.*;
import java.util.Arrays;

public class Application2447 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        //별 채우기
        char[][] arr=new char[N][N];
        for(int i=0;i<N;i++){
            Arrays.fill(arr[i],'*');
        }

        printStar(arr,N,0,0);

        //별 출력
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }



    }

    //9조각으로 나뉘어짐
    public static void printStar(char[][] arr,int l,int x,int y){
        //모서리의 좌표 행: x , 열: y
        int a=l/3;//9
        if(a==0){
            return;
        }
        for(int i=a+x;i<x+a*2;i++){
            for(int j=a+y;j<y+a*2;j++){
                arr[i][j]=' ';
            }
        }
        //a=9
        printStar(arr,l/3,x,y);// 0,0
        printStar(arr,l/3,x,y+a); //0,9
        printStar(arr,l/3,x,y+a*2);//0,18

        printStar(arr,l/3,x+a,y);//9,0
        printStar(arr,l/3,x+a,y+2*a);//9,18

        printStar(arr,l/3,x+a*2,y);//18,0
        printStar(arr,l/3,x+a*2,y+a);//18,9
        printStar(arr,l/3,x+a*2,y+2*a);//18,18
    }
}
