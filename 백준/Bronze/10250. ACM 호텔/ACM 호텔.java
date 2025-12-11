import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int floor;
            int room;

            if (N % H == 0) {
                floor = H;
                room = N / H;
            } else {
                floor = N % H;
                room = N / H + 1;
            }

            System.out.println(floor * 100 + room);
        }

        sc.close();
    }
}
