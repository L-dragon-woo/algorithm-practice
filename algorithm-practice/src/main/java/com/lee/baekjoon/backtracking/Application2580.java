package com.lee.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application2580 {
    static int[][] arr=new int[9][9];
    static int cnt;
    static boolean flag=true;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //배열 만들기
        for(int i=0;i<9;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        backtracking();

        for(int[] a:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }


    }


    public static void backtracking(){
        //return 조건
        if(flag==false) return;
        flag=false;
        for(int i =0; i<9; i++){
            for(int j=0;j<9;j++){
                if(arr[i][j]==0){
                    flag=true;
                    cnt=0;
                    int ans=0;
                    for(int k=1;k<=9;k++) {
                        if(findrow(i,k) && findcol(j,k) && findbox(i,j,k)){
                            ans=k;
                            //충족하는 수의 갯수 세기
                            cnt++;
                            if(cnt>1) break;
                        }
                    }
                    //후보가 1개이면 바로 대입
                    if(cnt==1){
                        arr[i][j]=ans;
                    }
                }
            }
        }
        //후보가 1개인거 다 넣었으면 다시 진행
        if(flag)
            backtracking();
    }

    public static boolean findrow(int row,int num){
        for(int i=0;i<9;i++){
            if(arr[row][i]==num){
                return false;
            }
        }
        return true;
    }

    public static boolean findcol(int col,int num){
        for(int i=0;i<9;i++){
            if(arr[i][col]==num){
                return false;
            }
        }
        return true;
    }

    public static boolean findbox(int row,int col,int num){
        for(int i=row/3*3;i<row/3*3+3;i++){
            for(int j=col/3*3;j<col/3*3+3;j++){
                if(arr[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }




}
