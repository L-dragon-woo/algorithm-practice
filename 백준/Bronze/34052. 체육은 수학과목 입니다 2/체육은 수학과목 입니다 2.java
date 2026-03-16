import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
       
        for (int i = 0; i < 4; i++) {
            total += sc.nextInt();
        }
        
        total += 300;
       
        if (total <= 1800) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}