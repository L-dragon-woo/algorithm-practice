class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int idx=0;
        int m=needle.length();
        while(idx<n-m+1){
            String str=haystack.substring(idx, idx+m);
            if(str.equals(needle)) return idx;
            idx++;
        }
        return -1;
    }
}