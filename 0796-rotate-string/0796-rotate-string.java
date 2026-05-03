class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();

        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            sb.append(s.substring(i,n));
            sb.append(s.substring(0,i));
            String str=sb.toString();
            if(goal.equals(str))return true;
    
        }
        return false;
    }
}