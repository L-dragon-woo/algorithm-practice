import java.util.*;

class Solution {

    public String solution(long n, String[] bans) {
        List<Long> banNums = new ArrayList<>();

        for (String ban : bans) {
            banNums.add(toNumber(ban));
        }

        Collections.sort(banNums);

        long target = n;
        for (long ban : banNums) {
            if (ban <= target) {
                target++;
            } else {
                break;
            }
        }

        return toString(target);
    }

    private long toNumber(String s) {
        long num = 0;
        for (char c : s.toCharArray()) {
            num = num * 26 + (c - 'a' + 1);
        }
        return num;
    }

    private String toString(long num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            num--;
            sb.append((char) ('a' + (num % 26)));
            num /= 26;
        }
        return sb.reverse().toString();
    }
}
