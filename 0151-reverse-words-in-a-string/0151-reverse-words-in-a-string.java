class Solution {
    public String reverseWords(String s) {  
        s=s.trim();
        String[] str= s.split(" ");
        int n=str.length;
        StringBuilder sb=new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(str[i].length()==0)continue;
            sb.append(str[i]);
            if(i==0)break;
            sb.append(" ");    
        }
        String ans=sb.toString();
        return ans;
    }
}