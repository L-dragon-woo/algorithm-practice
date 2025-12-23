package com.lee.baekjoon.accumulatedsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Application25682 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        // prefix sum arrays
        int[][] preB = new int[N + 1][M + 1];  // B 시작 체스판에서 다른 개수
        int[][] preW = new int[N + 1][M + 1];  // W 시작 체스판에서 다른 개수

        // 사전 패턴 비교 후 diff에 반영
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                // B 시작 체스판 예상 색
                char expectB = ((i + j) % 2 == 0) ? 'B' : 'W';
                // W 시작 체스판 예상 색
                char expectW = ((i + j) % 2 == 0) ? 'W' : 'B';

                int diffB = (board[i][j] != expectB ? 1 : 0);
                int diffW = (board[i][j] != expectW ? 1 : 0);

                // prefix sum 계산
                preB[i + 1][j + 1] = diffB
                        + preB[i][j + 1]
                        + preB[i + 1][j]
                        - preB[i][j];

                preW[i + 1][j + 1] = diffW
                        + preW[i][j + 1]
                        + preW[i + 1][j]
                        - preW[i][j];
            }
        }

        int answer = Integer.MAX_VALUE;

        // 모든 K×K 구간 검사
        for (int i = K; i <= N; i++) {
            for (int j = K; j <= M; j++) {

                int x1 = i - K;
                int y1 = j - K;

                // preB로 구간합 구하기
                int costB = preB[i][j]
                        - preB[x1][j]
                        - preB[i][y1]
                        + preB[x1][y1];

                // preW로 구간합
                int costW = preW[i][j]
                        - preW[x1][j]
                        - preW[i][y1]
                        + preW[x1][y1];

                answer = Math.min(answer, Math.min(costB, costW));
            }
        }

        System.out.println(answer);
    }
}
