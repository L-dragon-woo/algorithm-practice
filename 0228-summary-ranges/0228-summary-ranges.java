import java.util.*;
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String>list=new LinkedList<>();
        int n= nums.length;
        
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<n;i++){
            int currentNum=nums[i];
            if(sb.length()==0){
                sb.append(currentNum);
            }else{
                int beforeNum=nums[i-1];//8
                int pastNum=Integer.parseInt(sb.toString());//8
                if(beforeNum+1!=currentNum){
                    if(beforeNum==pastNum){
                        list.add(sb.toString());
                        sb=new StringBuilder();
                        sb.append(currentNum);
                    }else{
                    sb.append("->"+beforeNum);
                    list.add(sb.toString());
                    sb=new StringBuilder();
                    sb.append(currentNum);
                    }
                }else if(i==n-1){
                    sb.append("->"+currentNum);
                    list.add(sb.toString());
                    sb=new StringBuilder();   
                }
            }
        }

        if(sb.length()!=0){
            list.add(sb.toString());
        }

        return list;
    }
}