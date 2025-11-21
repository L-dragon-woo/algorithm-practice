
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        HashSet<String> list=new HashSet<>();
        ArrayList<String> ans=new ArrayList<>();

        //입력받기
        for(int i=0;i<N;i++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            String name=st.nextToken();
            String entrance=st.nextToken();
            if(entrance.equals("enter")){
                list.add(name);
            }else{
                list.remove(name);
            }
        }
        //정렬
        ans=list.stream().collect(Collectors.toCollection(ArrayList::new));
        ans.sort(Comparator.reverseOrder());
        for(String s:ans){
            System.out.println(s);
        }


    }
}
