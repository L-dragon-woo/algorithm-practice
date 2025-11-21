
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        Deque<Integer> deque=new ArrayDeque<>();
        Deque<Integer> temp=new ArrayDeque<>();
        Deque<Integer> ans=new ArrayDeque<>();

        for(int i=1;i<=n;i++){
            temp.offerLast(i);
        }

        for(int i=0;i<n;i++){
            deque.offerLast(sc.nextInt());
        }
        ans.add(1);

        int a;
        //첫번째
        while(deque.size()>0) {
            a=deque.pollFirst();
            temp.pollFirst();
            if(a>=0) {
                for (int i = 0; i < a - 1; i++) {
                    deque.offerLast(deque.pollFirst());
                    temp.offerLast(temp.pollFirst());
                }//-3 -1 2 1 //4 5 2 3   1

            }else{
                for (int i = 0; i < Math.abs(-a); i++) {
                    deque.offerFirst(deque.pollLast());
                    temp.offerFirst(temp.pollLast());
                }//-1 2 1 // 5 2 3    1 4
                //1 2 // 3 2   1 4 5
            }
            ans.add(temp.peekFirst());
            if(ans.size()==n){
                break;
            }
        }

        for(Integer i:ans){
            System.out.print(i+" ");
        }
    }
}
