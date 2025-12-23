package com.lee.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


        String a=br.readLine();
        String b=br.readLine();
        String c=br.readLine();

        if(!isString(a)){
            fizzBuzz(Integer.parseInt(a)+3);
        }else if(!isString(b)){
            fizzBuzz(Integer.parseInt(b)+2);
        }else if(!isString(c)){
            fizzBuzz(Integer.parseInt(c)+1);
        }

    }

    public static boolean isString(String str){
        if(str.equals("Fizz") || str.equals("Buzz") || str.equals("FizzBuzz")){
            return true;
        }else{
            return false;
        }
    }

    public static void fizzBuzz(int n){
        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }else if(n%3==0){
            System.out.println("Fizz");
        }else if(n%5==0){
            System.out.println("Buzz");
        }else{
            System.out.println(n);
        }
    }
}
