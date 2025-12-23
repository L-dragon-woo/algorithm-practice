import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] arr=new int[N];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Map<Integer,Integer> map=new HashMap<>();
        int left=0;
        int max=0;

        for(int i=0;i<N;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            while(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0)map.remove(arr[left]);
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        System.out.println(max);


    }

}
