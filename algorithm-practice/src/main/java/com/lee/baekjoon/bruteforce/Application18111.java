package com.lee.baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application18111 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int minTime = Integer.MAX_VALUE;
        int height = 0;

        // 기준 높이: 0 ~ 256
        for (int h = 0; h <= 256; h++) {
            int time = 0;
            int inventory = B;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int diff = arr[i][j] - h;

                    if (diff > 0) {        // 제거
                        time += diff * 2;
                        inventory += diff;
                    } else {               // 쌓기
                        time += -diff;
                        inventory += diff;
                    }
                }
            }

            if (inventory < 0) continue;

            if (time < minTime || (time == minTime && h > height)) {
                minTime = time;
                height = h;
            }
        }

        System.out.println(minTime + " " + height);
    }
}

