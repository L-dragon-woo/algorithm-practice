
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());

        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr=new int[N];
        int[] sorted=new int[N];

        for(int i=0;i<N;i++){
            int x=Integer.parseInt(st.nextToken());
            arr[i]=x;
            sorted[i]=x;
        }
        Arrays.sort(sorted);

        Map<Integer,Integer> map=new HashMap<>();
        int idx=0;

        for(int v:sorted){
            if(!map.containsKey(v)){
                map.put(v,idx++);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int v:arr){
            sb.append(map.get(v)).append(" ");
        }

        System.out.println(sb);
    }
}
