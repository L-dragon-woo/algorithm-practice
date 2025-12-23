package com.lee.baekjoon.reflexive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application2630 {
    static int bcnt=0;
    static int wcnt=0;
    static int[][]arr;
    public static void main(String[] args) throws IOException {
        //N= 2이상 128 꺼지
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());
        arr=new int[N][N];
        //배열 입력받기
        int kk=0;
        for(int i=0; i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                int k=Integer.parseInt(st.nextToken());
                kk+=k;
                arr[i][j]=k;
            }
        }
        if(kk==0){
            System.out.println(1);
            System.out.println(0);
        }else if(kk==N*N){
            System.out.println(0);
            System.out.println(1);
        }else {
            blue(0, 0, N);

            System.out.println(wcnt);
            System.out.println(bcnt);
        }

    }

    //n은 변의 길이임
    public static void blue(int row,int col,int n){


        //안 나눠져있다면
        if(!leftfront(row, col, n)) {
         blue(row,col,n/2);
        }

        if(!rightfront(row, col, n)) {
            blue(row,col+n/2,n/2);
        }

        if(!leftback(row, col, n)) {
            blue(row+n/2,col,n/2);
        }

        if(!rightback(row, col, n)) {
            blue(row+n/2,col+n/2,n/2);
        }


    }

    public static boolean leftfront(int row,int col,int n){

        n/=2;
        int tmp=0;
        for(int i=row;i<row+n;i++){
            for(int j=col;j<col+n;j++){

                tmp+=arr[i][j];
            }
        }
        if(tmp==n*n){
            bcnt++;
            return true;
        }else if(tmp==0) {
            wcnt++;
            return true;
        }else {
            return false;
        }

    } public static boolean rightfront(int row,int col,int n){

        n/=2;
        int tmp=0;
        for(int i=row;i<row+n;i++){
            for(int j=col+n;j<col+n*2;j++){
                tmp+=arr[i][j];
            }
        }
        if(tmp==n*n){
            bcnt++;
            return true;
        }else if(tmp==0) {
            wcnt++;
            return true;
        }else {
            return false;
        }


    } public static boolean leftback(int row,int col,int n){

        n/=2;
        int tmp=0;
        for(int i=row+n;i<row+n*2;i++){
            for(int j=col;j<col+n;j++){

                tmp+=arr[i][j];
            }
        }
        if(tmp==n*n){
            bcnt++;
            return true;
        }else if(tmp==0) {
            wcnt++;
            return true;
        }else {
            return false;
        }

    } public static boolean rightback(int row,int col,int n){

        n/=2;
        int tmp=0;
        for(int i=row+n;i<row+n*2;i++){
            for(int j=col+n;j<col+n*2;j++){

                tmp+=arr[i][j];
            }
        }
        if(tmp==n*n){
            bcnt++;
            return true;
        }else if(tmp==0) {
            wcnt++;
            return true;
        }else {
            return false;
        }
    }

}
