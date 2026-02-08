import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coin = sc.nextInt(); 
        int M = sc.nextInt(); 

       
        int money = coin * 100;
        
        if (money >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}