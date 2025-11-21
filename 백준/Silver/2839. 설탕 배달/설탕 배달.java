import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        int N=Integer.parseInt(st.nextToken());

        
        boolean isAns=false;
        int ans = -1;
        for(int i=0; i<N;i++){
            for(int j=0;j<N;j++){
                int a=i*3+j*5;
                if(a==N){
                    isAns=true;
                    ans=i+j;
                    break;
                }else if(a>N){
                    break;
                }
            }
            if(isAns){
                System.out.println(ans);
                break;
            }
        }
        if(!isAns){
            System.out.println(-1);
        }
    }
}
