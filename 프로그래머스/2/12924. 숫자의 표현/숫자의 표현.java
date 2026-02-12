class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int lp=1;
        int rp=1;
        int sum=1;
        
        while(rp<=n){
            if(sum==n)answer++;
            if(sum<=n){
                rp++;
                sum+=rp;
            }else{
                sum-=lp;
                lp++;
            }
        }
        
        return answer;
    }
}