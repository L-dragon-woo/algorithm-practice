import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static  boolean[] col1;
    static  boolean[] diag1;
    static  boolean[] diag2;
    static int cnt=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col1=new boolean[N];
        diag1=new boolean[2*N];
        diag2=new boolean[2*N];
        backtrack(0);
        System.out.println(cnt);
    }
    public static void backtrack(int row){
        if(row==N){
            cnt++;
            return;
        }
        //놓는 경우
        for(int col=0;col<N;col++){
            if(col1[col]==false && diag1[col+row]==false && diag2[col-row+N-1]==false){
                col1[col]=true;
                diag1[col+row]=true;
                diag2[col-row+N-1]=true;
                backtrack(row+1);
                col1[col]=false;
                diag1[col+row]=false;
                diag2[col-row+N-1]=false;
            }
        }
    }
}
