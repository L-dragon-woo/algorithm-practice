import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<StringBuilder> ans=new ArrayList<>();
        while(true) {
            int n = sc.nextInt();
            if(n==-1)break;
            ans.add(new StringBuilder(isGood(n)));
        }

        for(StringBuilder i:ans){
            System.out.println(i);
        }

    }

    public static String isGood(int n){
        int cnt=1;
        StringBuilder sb=new StringBuilder();
        sb.append(n);
        sb.append(" = 1 + ");
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=2;i<n;i++){
            if(n%i==0) {
                cnt += i;
                arr.add(i);
            }
        }
        //완전수라면
        if(cnt==n){
            Iterator<Integer> iterator=arr.iterator();
             while(iterator.hasNext()){
                 sb.append(iterator.next());
                 if(iterator.hasNext()){
                     sb.append(" + ");
                 }
             }
            return sb.toString();
        }else{
            return n+" is NOT perfect.";
        }
    }
}
