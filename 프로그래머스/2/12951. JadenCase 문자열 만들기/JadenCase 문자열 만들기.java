class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        boolean isFirst = true; // 단어의 첫 글자인지 판단
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (isFirst) {
                // 첫 글자면 대문자
                sb.append(Character.toUpperCase(c));
            } else {
                // 나머지는 소문자
                sb.append(Character.toLowerCase(c));
            }
            
            // 공백이면 다음 글자는 단어의 첫 글자
            if (c == ' ') {
                isFirst = true;
            } else {
                isFirst = false;
            }
        }
        
        return sb.toString();
    }
}
