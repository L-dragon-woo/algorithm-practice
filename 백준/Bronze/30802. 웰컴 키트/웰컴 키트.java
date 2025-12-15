import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        StringTokenizer st1=new StringTokenizer(br.readLine());
        int T=Integer.parseInt(st1.nextToken());
        int P=Integer.parseInt(st1.nextToken());

        int tmp=0;
        for(int i=0;i<6;i++){
            if(arr[i]%T>0){
                tmp++;
            }
            tmp+=arr[i]/T;
        }

        System.out.println(tmp);
        System.out.println(N/P+" "+N%P);


    }
}
