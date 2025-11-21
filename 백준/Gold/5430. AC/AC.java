
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();   

        for (int i = 0; i < T; i++) {
            String function = sc.next();  
            int arrsize = sc.nextInt();   
            String str = sc.next();       

            
            str = str.replace("[", "").replace("]", "");
            Deque<Integer> deque = new ArrayDeque<>();

            if (arrsize > 0) {
                deque = Arrays.stream(str.split(","))
                        .map(String::trim)
                        .map(Integer::parseInt)
                        .collect(Collectors.toCollection(ArrayDeque::new));
            }

            boolean isR = true; 
            boolean isError = false;

            for (char c : function.toCharArray()) {
                if (c == 'R') {
                    isR = !isR;
                } else { // 'D'
                    if (deque.isEmpty()) {
                        System.out.println("error");
                        isError = true;
                        break;
                    }
                    if (isR) deque.pollFirst();
                    else deque.pollLast();
                }
            }

            if (!isError) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                if (isR) {
                    Iterator<Integer> it = deque.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        if (it.hasNext()) sb.append(",");
                    }
                } else {
                    Iterator<Integer> it = deque.descendingIterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        if (it.hasNext()) sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb);
            }
        }
    }
}
