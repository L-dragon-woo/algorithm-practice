
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int T=Integer.parseInt(br.readLine());
        int[] arr=new int[T];
        int max=0;
        //입력값 중에 최댓값을 찾아서 최댓값을 기준으로 소수값을 찾을 것임
        for(int i=0;i<T;i++){
            int a=Integer.parseInt(br.readLine());
            arr[i]=a;
            max=Math.max(max,a);

        }

        //소수를 배열에 저장하기
        HashSet<Integer> primeList=new HashSet<>();
        for(int i=2;i<max;i++){
            if(isPrime(i)){
                primeList.add(i);
            }
        }

        for(int i=0;i<T;i++){
            int cnt=0;
            for(int j=2; j<=arr[i]/2;j++){
                if(primeList.contains(arr[i]-j) && primeList.contains(j))
                    cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
    public static boolean isPrime(int n){
        for(int i=2; i<(int)Math.sqrt(n)+1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
