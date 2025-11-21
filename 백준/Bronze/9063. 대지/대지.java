
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        int Xmax=-10001;
        int Ymax=-10001;
        int Xmin=10001;
        int Ymin=10001;

        //입력 받기
        for(int i=0;i<N;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            Xmax=Math.max(Xmax,a);
            Ymax=Math.max(Ymax,b);
            Xmin=Math.min(Xmin,a);
            Ymin=Math.min(Ymin,b);
        }

        System.out.println((Xmax-Xmin)*(Ymax-Ymin));

    }
}
