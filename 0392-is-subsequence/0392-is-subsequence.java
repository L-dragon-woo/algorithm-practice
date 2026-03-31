class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(""))return true;
        int n=s.length();
        int m=t.length();

        int sidx=0;
        int tidx=0;

        while(sidx<n && tidx<m){
            char sch=s.charAt(sidx);
            char tch=t.charAt(tidx);
            if(sch==tch){
                tidx++;
                sidx++;
            }else{
                tidx++;
            }
        }
        if(sidx==n)return true;
        else return false;
    }
}