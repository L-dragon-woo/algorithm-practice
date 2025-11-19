package com.ohgiraffers.baekjoon.deque;

import java.util.*;
import java.util.stream.Collectors;

public class Application5430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            String function = sc.next();  // 함수 문자열
            int arrsize = sc.nextInt();   // 배열 크기
            String str = sc.next();       // 배열 입력 예: [1,2,3,4]

            // 입력 문자열 처리
            str = str.replace("[", "").replace("]", "");
            Deque<Integer> deque = new ArrayDeque<>();

            if (arrsize > 0) {
                deque = Arrays.stream(str.split(","))
                        .map(String::trim)
                        .map(Integer::parseInt)
                        .collect(Collectors.toCollection(ArrayDeque::new));
            }

            boolean isR = true; // 방향 (true: 정방향, false: 역방향)
            boolean isError = false;

            for (char c : function.toCharArray()) {
                if (c == 'R') {
                    isR = !isR;
                } else { // 'D'
                    if (deque.isEmpty()) {
                        System.out.println("error");
                        isError = true;
                        break;
                    }
                    if (isR) deque.pollFirst();
                    else deque.pollLast();
                }
            }

            if (!isError) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                if (isR) {
                    Iterator<Integer> it = deque.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        if (it.hasNext()) sb.append(",");
                    }
                } else {
                    Iterator<Integer> it = deque.descendingIterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        if (it.hasNext()) sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb);
            }
        }
    }
}
