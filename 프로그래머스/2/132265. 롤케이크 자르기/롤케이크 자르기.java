import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer>set=new HashSet<>();
        int std=0;
        int n=topping.length;
        while(std<n){
            if(set.size()>n-std)break;
            int top=topping[std];
            set.add(top);
            int stdd=std+1;
            Set<Integer>s=new HashSet<>();
            while(stdd<n){
                int t=topping[stdd];
                s.add(t);
                if(s.size()>set.size()){
                    break;
                }
                stdd++;
            }
            if(s.size()==set.size()){
                answer++;
            }
            std++;
        }
        return answer;
    }
}

 