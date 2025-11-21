
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        
        int a=Integer.parseInt(st.nextToken());
        int cnt=0;
        int num=666;
        
        while(true){
            if(String.valueOf(num).contains("666")){
                cnt++;
            }
            if(cnt==a){
                System.out.println(num);
                break;
            }
            num++;
        }
        
    }
}