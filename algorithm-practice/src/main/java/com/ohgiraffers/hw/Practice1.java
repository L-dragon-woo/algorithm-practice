package com.ohgiraffers.hw;

import java.io.CharArrayReader;
import java.util.ArrayDeque;
import java.util.Stack;

public class Practice1 {

    public String solution(String input){
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();

        //담기
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
                stack1.push(input.charAt(i));
                if(stack2.isEmpty()){
                   continue;
                }else{
                    stack2.pop();
                    stack1.pop();
                }
            }else if(input.charAt(i)==')'){
                stack2.push(input.charAt(i));
                if(stack1.isEmpty()){
                    continue;
                }else{
                    stack1.pop();
                    stack2.pop();
                }
            }
        }
        if(stack1.isEmpty() && stack2.isEmpty()){
            return "YES";
        }else{
            return "NO";
        }

    }
}
