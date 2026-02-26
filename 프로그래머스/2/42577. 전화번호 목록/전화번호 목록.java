import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Set<String>set=new HashSet<>();
        for(int i=0; i<phone_book.length;i++){
            String phone =phone_book[i];
            set.add(phone);
        }
        boolean flag=false;
        for(String str : set){
            for(int j=0; j<str.length()-1;j++){
                if(set.contains(str.substring(0,j+1))){
                    answer=false;
                    flag=true;
                    break;
                }
            }
            if(flag)break;
        }
        return answer;
    }
}