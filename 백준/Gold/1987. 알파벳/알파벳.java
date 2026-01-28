import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class tmp{
        int row;
        int col;
        int cost;
        boolean[] alphabets;
        tmp(int row,int col,boolean[] alphabets,int cost){
            this.row=row;
            this.col=col;
            this.cost=cost;
            this.alphabets=alphabets;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int R=Integer.parseInt(st.nextToken());
        int C=Integer.parseInt(st.nextToken());

        char[][]arr=new char[R][C];
        for(int i=0;i<R;i++)
            arr[i]=br.readLine().toCharArray();

        //DFS
        boolean[]alphabet=new boolean[26];
        tmp tmp1=new tmp(0,0,alphabet,0);

        Stack<tmp>stack=new Stack<>();
        stack.push(tmp1);

        int max=0;
        while(!stack.isEmpty()){
            tmp temp=stack.pop();
            int row=temp.row;
            int col=temp.col;
            boolean[] alphabets=temp.alphabets;
            int cost=temp.cost+1;
            alphabets[(int)arr[row][col]-65]=true;
            max=Math.max(max,cost);
            //상
            if(row-1>=0&&!alphabets[(int)arr[row-1][col]-65]){
                stack.push(new tmp(row-1,col,alphabets.clone() ,cost));
            }
            //하
            if(row+1<R&&!alphabets[(int)arr[row+1][col]-65]){
                stack.push(new tmp(row+1,col,alphabets.clone(),cost));
            }
            //좌
            if(col-1>=0&&!alphabets[(int)arr[row][col-1]-65]){
                stack.push(new tmp(row,col-1,alphabets.clone(),cost));
            }
            //우
            if(col+1<C&&!alphabets[(int)arr[row][col+1]-65]){
                stack.push(new tmp(row,col+1,alphabets.clone(),cost));
            }
        }
        System.out.println(max);
    }
}
