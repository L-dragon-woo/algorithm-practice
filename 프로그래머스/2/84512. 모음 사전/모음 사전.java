class Solution {
    public int solution(String word) {
        int answer = 0;
        
        String str="";
        String[] arr=new String[]{"A","E","I","O","U"};
        for(int i=0;i<5;i++){
            if(i==0)str+=arr[i];//A
            else{
                str=str.substring(0,str.length()-1)+arr[i];
            }
            answer++;
            if(str.equals(word))return answer;
            for(int j=0;j<5;j++){
                if(j==0)str+=arr[j];//A
                else{
                str=str.substring(0,str.length()-1)+arr[j];
            }
                answer++;
                if(str.equals(word))return answer;
                for(int k=0;k<5;k++){
                    if(k==0)str+=arr[k];//A
                    else{
                str=str.substring(0,str.length()-1)+arr[k];
            }
                    answer++;
                    if(str.equals(word))return answer;
                    for(int l=0;l<5;l++){
                        if(l==0)str+=arr[l];//A
                        else{
                str=str.substring(0,str.length()-1)+arr[l];
            }
                        answer++;
                        if(str.equals(word))return answer;
                        for(int m=0;m<5;m++){
                            if(m==0)str+=arr[m];//A
                            else{
                str=str.substring(0,str.length()-1)+arr[m];
            }
                            answer++;
                            if(str.equals(word))return answer;
                        }
                        str=str.substring(0,str.length()-1);
                    }
                    str=str.substring(0,str.length()-1);
                }
                str=str.substring(0,str.length()-1);
            }
            str=str.substring(0,str.length()-1);
        }
        
        return answer;
    }
}