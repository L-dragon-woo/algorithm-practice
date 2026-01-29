class Solution {
    public int solution(int[] players, int m, int k) {
        //m 서버 한대로 감당할 수 있는 최대 이용자 수
        //k 서버 한 대가 운영 가능한 시간을 나타내는 정수
        int[] n=new int[24];//각 시간에 증설된 서버를 넣어줄거임!
        int answer=0;
        for(int i=0;i<24;i++){
            int player=players[i];
            if(player<m)continue;
            int sta=player/m;
            if(n[i]<sta){
                int tmp=sta-n[i];//tmp는 증설횟수임
                answer+=tmp;
                System.out.println("i : "+i+" tmp : "+tmp);
                n[i]=sta;
                for(int j=i;j<i+k;j++){
                    if(j==24){
                        break;
                    }
                    n[j]+=tmp;
                    
                }
            }
            
        }
        
        return answer;
    }
}