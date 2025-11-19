package com.ohgiraffers.baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

public class Application9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> ans=new Stack<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String input=sc.next();
            ans.push(new Solution9012().solution(input));
        }

        for(String i:ans){
            System.out.println(i);
        }
    }


}

class Solution9012{
    public String solution(String input){
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();

        //담기
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                stack1.push(input.charAt(i));
                if(!stack2.isEmpty()){
                    stack2.pop();
                    stack1.pop();
                }
            }else if(input.charAt(i)==')'){
                stack2.push(input.charAt(i));
                if(!stack1.isEmpty()){
                    stack1.pop();
                    stack2.pop();
                }
            }
            if(!stack2.isEmpty()){
                return "NO";
            }
        }
        if(stack1.isEmpty() && stack2.isEmpty()){
            return "YES";
        }else{
            return "NO";
        }

    }
}