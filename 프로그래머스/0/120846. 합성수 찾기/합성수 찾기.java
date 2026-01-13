import java.math.*;
class Solution {
    public int solution(int n) {
        int num=2;
        if(n==2)return 0;
        if(n==1)return 0;
        //소수찾기
        for(int j=3; j<=n; j++){
            boolean flag=false;
            for(int i=2; i<(int)Math.sqrt(j)+2;i++){
                System.out.println("j: "+j+" i : "+i);
                if(j%i!=0){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag){num++;
                    System.out.println(j);
                    }
        }
        int answer = n-num;
        return answer;
    }
}