
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Set<String> set=new HashSet<>();

        int b=0;
        for(int i=0;i<N;i++){
            String a=br.readLine();
            if(a.equals("ENTER")){
                b+=set.size();
                set.clear();
            }else{
                set.add(a);
            }
        }
        b+=set.size();
        System.out.println(b);
    }
}
