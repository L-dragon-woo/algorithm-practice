package com.lee.baekjoon.reflexive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Application24060 {
    static int cnt=0;
    static int k=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(st.nextToken());

        k=K;

        StringTokenizer st1=new StringTokenizer(br.readLine());
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st1.nextToken());
        }
        sort(arr,0,N-1);

        if(cnt<k) System.out.println(-1);
    }

    public static void sort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int mid=(left+right)/2;
        //합병정렬에서 하나의 배열을 두개의 배열로 나누는 과정
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
      int l=left;
      int r=mid+1;
      int start=left;
      //새로운 배열로 가져와야함
      int[] leftarr=new int[mid-left+1];
      int[] rightarr=new int[right-mid];
      for(int i=0;i<leftarr.length;i++){
          leftarr[i]=arr[l++];
      }
      for(int i=0;i<rightarr.length;i++){
          rightarr[i]=arr[r++];
      }

      int L=0,R=0;

      while(L<leftarr.length && R<rightarr.length){
          if(leftarr[L]<=rightarr[R]){
              arr[start]=leftarr[L];
              cnt++;
              if(cnt==k){
                  System.out.println(arr[start]);
              }
              start++;
              L++;
          }else{
              arr[start]=rightarr[R];
              cnt++;
              if(cnt==k){
                  System.out.println(arr[start]);
              }
              start++;
              R++;
          }
      }

      if(L<leftarr.length){
          while(L<leftarr.length){
              arr[start]=leftarr[L];
              cnt++;
              if(cnt==k){
                  System.out.println(arr[start]);
              }
              start++;
              L++;
          }
      }else if(R<rightarr.length){
          while(R<rightarr.length){
              arr[start]=rightarr[R];
              cnt++;
              if(cnt==k){
                  System.out.println(arr[start]);
              }
              start++;
              R++;
          }
      }
    }
}
