

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }


        //정렬
        list.sort((a,b)->b-a);
        //사람의 수
        int start=(int)Math.round((double)n*0.15);
        int h=n-start*2;
        int sum=0;
        for(int i=start;i<start+h;i++){
            sum+=list.get(i);
        }

        System.out.println(Math.round(Math.round((double)sum/h)));










    }
}
