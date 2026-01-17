import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        Set<String>set=new HashSet<>();
        
        int turn=0;
        int num=0;
        for(int i=0; i<words.length;i++){
            String word=words[i];
            //중복, 끝단어 연결, 한글자
            if(i==0){
                if(word.length()==1){
                    break;
                }else{
                    set.add(word);
                    continue;
                }
            }
            
            
            if(set.contains(word)
               ||word.length()<=1
               ||!(word.substring(0,1)
                  .equals
                   (words[i-1].substring(words[i-1].length()-1,words[i-1].length()))))
                  {
                System.out.println("word :"+word+" i: "+i);
                num=i%n+1;
                turn=i/n+1;
                break;
            }else{
                set.add(word);
            }
        }
        
        int[] answer = {num,turn};
 

        return answer;
    }
}