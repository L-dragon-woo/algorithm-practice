import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        char[] result = arr[0].toCharArray();

        for (int i = 0; i < result.length; i++) {
            for (int j = 1; j < N; j++) {
                if (result[i] != arr[j].charAt(i)) {
                    result[i] = '?';
                    break;
                }
            }
        }

        System.out.println(new String(result));
    }
}