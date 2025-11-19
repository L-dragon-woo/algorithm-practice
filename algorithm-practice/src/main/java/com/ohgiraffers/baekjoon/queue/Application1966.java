package com.ohgiraffers.baekjoon.queue;

import java.util.*;

public class Application1966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ans = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Queue<int[]> queue = new LinkedList<>();
            int num = sc.nextInt();
            int tmp = sc.nextInt();

            for(int j=0; j<num;j++){
                int tmpp=sc.nextInt();
                queue.add(new int[]{j,tmpp });
            }//초기인덱스, 값

            boolean isEnd=false;
            int cnt=1;
            while(!queue.isEmpty()){
                //최댓값찾기
                int max=0;
                for(int j=0;j<queue.size();j++){
                    max=Math.max(max,queue.peek()[1]);
                    queue.offer(queue.poll());
                }
                //1.최댓값과 일치할때까지 돌림
                for(int j=0;j<queue.size();j++){
                    //1-1. 최댓값과 일치하는 것을 만나면
                    if(queue.peek()[1]==max){
                        //1-1-1. 인덱스값이 tmp와 같은 지 확인
                        if(queue.peek()[0]==tmp){
                            isEnd=true;
                            break;
                        }else{
                            //1-1-2. 아니면 삭제하고 다음으로 넘어감
                            queue.poll();
                            cnt++;
                            break;
                        }
                    }else{
                        //1-2. 아니면 계속 찾기 위해서 반복함
                        queue.offer(queue.poll());
                    }
                }

                if(isEnd){
                    break;
                }

            }
            ans.add(cnt);

        }
        for(Integer i:ans){
            System.out.println(i);
        }




    }
}
