
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        List<Integer> ans=new ArrayList<>();
        int a=sc.nextInt();


        //값 입력
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            if(b!=0) {
                if(b>=0){
                    pq.add(b);
                }else{
                    pq2.add(-b);
                }
            }
            else{

                if (!pq.isEmpty() && !pq2.isEmpty()) {
                    if(pq.peek()<Math.abs(pq2.peek())){
                        ans.add(pq.poll());
                    }else{
                        ans.add(-pq2.poll());
                    }
                }else if(!pq.isEmpty()){
                    ans.add(pq.poll());
                }else if(!pq2.isEmpty()){
                    ans.add(-pq2.poll());
                }else{
                    ans.add(0);
                }

            }
        }

        for(Integer i:ans){
            System.out.println(i);
        }
    }
}