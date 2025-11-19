package com.lee.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Application5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[3];

            for (int i = 0; i < 3; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            // 종료 조건
            if (a[0] == 0 && a[1] == 0 && a[2] == 0) {
                break;
            }

            int max = Math.max(a[0], Math.max(a[1], a[2]));
            int sum = a[0] + a[1] + a[2];

            if (max >= sum - max) {
                list.add("Invalid");
            }
            else if (a[0] == a[1] && a[1] == a[2]) {
                list.add("Equilateral");
            }
            else if (a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
                list.add("Isosceles");
            }
            else {
                list.add("Scalene");
            }
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
