import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int M=Integer.parseInt(br.readLine());
        String str=br.readLine();

        StringBuilder sb=new StringBuilder();
        sb.append("I");
        for(int i=1;i<=N;i++){
            sb.append("OI");
        }
        String ans=sb.toString();
        int start=0;
        int cnt=0;
        while(start+sb.length()<=M){
            if(ans.equals(str.substring(start,start+ans.length())))cnt++;
            start++;
        }
        System.out.println(cnt);

    }
}
