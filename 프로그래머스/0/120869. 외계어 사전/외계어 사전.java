class Solution {
    public int solution(String[] spell, String[] dic) {
       String all="";
        for(String a:spell){
            all+=a;
        }//all=pos
        String original=all;
        
        for(String str:dic){
            if(all.length()!=str.length())continue;
            int num=0;
            all=original;
            for(int i=0; i<str.length();i++){
               if(all.contains(str.substring(i,i+1))){
                   num++;
                   all=all.replace(str.substring(i,i+1),"0");
               }else{
                   break;
               }
           }
            System.out.println(all);
            if(num==str.length()){
                return 1;
            }
           
       }
        return 2;
    }
}