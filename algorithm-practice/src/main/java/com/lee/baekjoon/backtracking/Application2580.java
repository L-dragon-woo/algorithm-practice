package com.lee.baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Application2580 {
    static int[][] arr=new int[9][9];
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //배열 만들기
        for(int i=0;i<9;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        backtracking(0,0);
        System.out.println(Arrays.deepToString(arr));



    }
    public static void backtracking(int i, int j){
        HashSet<Integer> set=new HashSet<>();
        for(int z=1;z<=9;z++){
            set.add(z);
        }
        for(int k=i; k<9; k++){
            for(int l=j; l<9; l++){
             if(arr[k][l]==0){
                 findrow(k,l,findcol(k,l,findbox(k,l,set)));
                 //이제 후보군들이 들어옴
                 while(!set.isEmpty()){
                     arr[k][l]=set.iterator().next();
                     set.remove(arr[k][l]);

                 }
             }
            }
        }
    }

    //행 찾기
    public static HashSet<Integer> findrow(int row, int col, HashSet<Integer> set){
        for(int i=0;i<9;i++){
            //0이 아닌 수를 삭제하고 들어올 수 있는 것들을 테스트
            if(arr[row][i]!=0 && set.contains(arr[row][i])){
                set.remove(arr[row][i]);
            }
        }
        return set;
    }

    //열 찾기
    public static HashSet<Integer> findcol(int row, int col, HashSet<Integer> set){
        for(int i=0;i<9;i++){
            if(arr[i][col]!=0 && set.contains(arr[i][col])){
                set.remove(arr[i][col]);
            }
        }
        return set;
    }

    //9칸 안에서 찾기
    public static HashSet<Integer> findbox(int row, int col, HashSet<Integer> set){
        int boxRow=row-row%3;
        int boxCol=col-col%3;
        for(int i=boxRow;i<boxRow+3;i++){
            for(int j=boxCol;j<boxCol+3;j++){
                if(arr[i][j]!=0 && set.contains(arr[i][j])){
                    set.remove(arr[i][j]);
                }
            }
        }
        return set;
    }

}
