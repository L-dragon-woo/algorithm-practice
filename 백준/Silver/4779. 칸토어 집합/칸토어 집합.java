import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input="";
        StringBuilder sb=new StringBuilder();
        while((input=br.readLine())!=null){
            int N=Integer.parseInt(input);
            //크기 만들고
            String[] arr=new String[(int) Math.pow(3,N)];
            //초기 설정
            for(int i=0;i<arr.length;i++){
                arr[i]="-";
            }
            Cantor(arr,0,arr.length);

           for(String s:arr){
                sb.append(s);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
    //27개이면 idx=9~idx=17까지 바꾸는거임 standard=9
    //idx=3~idx=5    idx=18~idx=20
    //left=0, right=27; right=arr.length
    //int mid=(right-left)/3=9
    //for(int i=mid;i<mid*2;i++){
    /*
    *Cator(arr,left,right/3)
    *Cantor(arr,left=mid*2,right)
    * */
    public static void Cantor(String[] arr,int left,int right){
        if(right-left<=1){
            return;
        }
        int a=(right-left)/3;//1
        int mid=left+(right-left)/3;//7
       for(int i=mid;i<mid+a;i++){
            arr[i]=" ";
        }
        Cantor(arr,left,mid);
        Cantor(arr,mid+a,right);
    }
}
