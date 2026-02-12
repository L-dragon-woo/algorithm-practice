import java.util.*;
class Solution {
    public int solution(int n) {
        String binaryN=Integer.toBinaryString(n);  
        int N=countOne(binaryN);
        
        int answer = 0;
        
        while(true){
           int a=++n;
           String binaryA=Integer.toBinaryString(a);
           if(N==countOne(binaryA)){
               answer=a;
               break;
           }
        }
        return answer;
    }
    
    //1의 갯수 세기
    private int countOne(String bin){
        int num=0;
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='1'){
                num++;
            }
        }
        return num;
    }
}