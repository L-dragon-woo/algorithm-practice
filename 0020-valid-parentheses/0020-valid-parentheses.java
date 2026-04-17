import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Deque<Character>dq=new LinkedList<>();
        int n=s.length();
        for(int i=0; i<n;i++){
            char ch=s.charAt(i);        
            if(dq.isEmpty()){
                if(ch=='}'||ch==']'||ch==')')return false;
                dq.offerLast(ch);
            }else{
                char p=dq.peekLast();
                if(p=='('&& ch==')')dq.pollLast();
                else if(p=='{'&&ch=='}')dq.pollLast();
                else if(p=='['&&ch==']')dq.pollLast();
                else dq.offerLast(ch);
            }
        }

        if(dq.isEmpty())return true;
        else return false;
    }
}