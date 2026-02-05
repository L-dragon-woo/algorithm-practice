import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int time = scanner.nextInt();
        int s = scanner.nextInt();
        
        if (s == 1) {
            System.out.println("280");
        } else if (time >= 12 && time <= 16) {
            System.out.println("320");
        } else {
            System.out.println("280");
        }
    }
}