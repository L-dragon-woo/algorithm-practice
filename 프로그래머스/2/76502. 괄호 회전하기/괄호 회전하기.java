import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0;i<s.length();i++){
            String st=s.substring(1,s.length());
            st+=s.substring(0,1);
            s=st;
            if(tmp(st))answer++;
        }
        
        return answer;
    }
    private boolean tmp(String str){
        Deque<Character>dq=new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);//{ [ (
            if(!dq.isEmpty()){
                if(ch=='}'&&dq.peek()=='{'){
                    dq.pop();
                }else if(ch==']'&&dq.peek()=='['){
                    dq.pop();
                }else if(ch==')'&&dq.peek()=='('){
                    dq.pop();
            }else{
                    dq.push(ch);
                }
        }else{
                dq.push(ch);
            }
    }
        if(dq.isEmpty())return true;//O
        else return false;//X
    }
}