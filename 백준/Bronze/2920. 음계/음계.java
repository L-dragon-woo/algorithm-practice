import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int[]arr=new int[st.countTokens()];

        arr[0]=Integer.parseInt(st.nextToken());

        int descCnt=0;
        int ascCnt=0;
        for(int i=1;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i-1]>arr[i]){
                descCnt++;
            }
            if(arr[i-1]<arr[i]){
                ascCnt++;
            }
        }

        if(ascCnt==0){
            System.out.println("descending");
        }else if(descCnt==0){
            System.out.println("ascending");
        }else{
            System.out.println("mixed");
        }


    }
}
