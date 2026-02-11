import java.util.*;

class Solution {
    int removeZeroCount = 0;
    int transformCount = 0;

    public int[] solution(String s) {
        binary(s);
        return new int[]{transformCount, removeZeroCount};
    }

    private void binary(String s) {

        if (s.equals("1")) return;

        transformCount++;

        int originalLength = s.length();

        s = s.replace("0", "");

        int newLength = s.length();

        removeZeroCount += originalLength - newLength;

        String next = Integer.toBinaryString(newLength);

        binary(next);
    }
}
