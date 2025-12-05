package com.lee.baekjoon.khdg;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Application34850 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger ans = new BigInteger(st.nextToken());


        BigInteger MOD = BigInteger.valueOf(1000000007);


        while (st.hasMoreTokens()) {

            BigInteger b = new BigInteger(st.nextToken());


            BigInteger add = ans.add(b).mod(MOD);


            BigInteger sub = ans.subtract(b);



            BigInteger mul = ans.multiply(b);


            BigInteger div = ans.divide(b).mod(MOD);



            BigInteger max = add;
            if(mul.compareTo(max) > 0) max = mul;
            if(sub.compareTo(max) > 0) max = sub;
            if(div.compareTo(max) > 0) max = div;

            ans = max;

        }

        System.out.println(ans.mod(MOD));
    }
}
