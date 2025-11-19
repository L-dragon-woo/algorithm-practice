package com.ohgiraffers.baekjoon.dgu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] grid = new int[N][M];
        //입력받기
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            grid[i] = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        }
        boolean found = true;
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < M-1; j++) {
                if (grid[i][j] == 1) {
                    int width = 0;
                    while (i + width < N && grid[i + width][j] == 1) {
                        width++;
                    }
                    int height = 0;
                    while (j + height < M && grid[i][j + height] == 1) {
                        height++;
                    }
                    //종양있는지 판단

                }

            }

        }
        if (!found) {
            System.out.println(1);
        }

    }
}
