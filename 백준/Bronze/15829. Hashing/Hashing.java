
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
        BigInteger c=new BigInteger("31");
        BigInteger MOD=new BigInteger("1234567891");
        for(int i=0;i<L;i++){
            BigInteger a=new BigInteger(String.valueOf(str.charAt(i)-96));
            BigInteger b=c.pow(i);
            sum=sum.add(a.multiply(b).mod(MOD));
        }
        System.out.println(sum.mod(MOD));
    }
}
