import java.util.*;
class Solution {
    boolean solution(String s) {
        Deque<String>dq=new LinkedList<>();
        
        for(int i=0; i<s.length();i++){
            String str=s.substring(i,i+1);
            if(str.equals("(")){
                dq.offerFirst(str);
            }else{
                if(!dq.isEmpty()&&dq.peekLast().equals("(")){
                    dq.pollLast();
                }else{
                    dq.offerLast(str);
                }
            }
        }
        
        if(dq.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}