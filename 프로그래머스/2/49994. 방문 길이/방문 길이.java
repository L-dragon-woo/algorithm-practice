import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String>set=new HashSet<>();
        int row=0;
        int col=0;
        
        
        int answer = 0;
        for(int i=0; i<dirs.length();i++){
            char ch=dirs.charAt(i);
            int startrow=row;
            int startcol=col;
            if(ch=='U'){
                if(row+1<=5){
                    row++;
                    if(!set.contains(startrow+" "+startcol+" "+row+" "+col)&&
                      !set.contains(row+" "+col+" "+startrow+" "+startcol)){
                        answer++;
                    }
                    set.add(startrow+" "+startcol+" "+row+" "+col);
                    set.add(row+" "+col+" "+startrow+" "+startcol);
                }
            }else if(ch=='D'){
                if(row-1>=-5){
                    row--;
                    if(!set.contains(startrow+" "+startcol+" "+row+" "+col)&&
                      !set.contains(row+" "+col+" "+startrow+" "+startcol)){
                        answer++;
                    }
                    set.add(startrow+" "+startcol+" "+row+" "+col);
                    set.add(row+" "+col+" "+startrow+" "+startcol);
                }
            }else if(ch=='L'){
                 if(col-1>=-5){
                    col--;
                    if(!set.contains(startrow+" "+startcol+" "+row+" "+col)&&
                      !set.contains(row+" "+col+" "+startrow+" "+startcol)){
                        answer++;
                    }
                    set.add(startrow+" "+startcol+" "+row+" "+col);
                    set.add(row+" "+col+" "+startrow+" "+startcol);
                }
            }else if(ch=='R'){
                 if(col+1<=5){
                    col++;
                    if(!set.contains(startrow+" "+startcol+" "+row+" "+col)&&
                      !set.contains(row+" "+col+" "+startrow+" "+startcol)){
                        answer++;
                    }
                     set.add(startrow+" "+startcol+" "+row+" "+col);
                    set.add(row+" "+col+" "+startrow+" "+startcol);
                }
            }
            // System.out.println("ch : "+ch+"("+col+" , "+row+")"+"answer : "+answer);
        }
        
        
        return answer;
    }
}