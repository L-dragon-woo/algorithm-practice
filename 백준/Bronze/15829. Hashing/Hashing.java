import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int L=Integer.parseInt(br.readLine());
        String str=new String(br.readLine());
        BigInteger sum=BigInteger.ZERO;

        for(int i=0;i<L;i++){
            BigInteger a=new BigInteger(String.valueOf(str.charAt(i)-96));
            BigInteger b=new BigInteger(String.valueOf((long)Math.pow(31,i)));
            sum=sum.add(a.multiply(b));
        }

        System.out.println(sum);
        
    }
}
