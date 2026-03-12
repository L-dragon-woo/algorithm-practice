import java.util.*;
class Solution {
    public int romanToInt(String s) {
        Deque<Character>dq=new LinkedList<>();
        Map<Character,Integer>map=new HashMap<>(); 
        map.put('I',1); 
        map.put('V',5); 
        map.put('X',10); 
        map.put('L',50); 
        map.put('C',100); 
        map.put('D',500); 
        map.put('M',1000);
        
        int n=s.length();

        for(int i=0; i<n; i++){
            char ch=s.charAt(i);
            dq.offerLast(ch);
        }

        int sum=0;
        
        while(!dq.isEmpty()){
            char ch1=dq.pollFirst();
            int i1=map.get(ch1);

            if(dq.isEmpty()){
                sum+=i1;
                break;
            }
            char ch2=dq.peekFirst();
            int i2=map.get(ch2);
            if(i1<i2){
                sum+=i2-i1;
                dq.pollFirst();
            }else{
                sum+=i1;
            }
        }

        return sum;
    }
}