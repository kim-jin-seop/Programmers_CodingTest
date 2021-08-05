package level2_kakao_60057;

public class Solution {

    public int solution(String s) {
        int min = s.length();
        for (int count = 1; count <= s.length() / 2; count++) {
            int length = findLength(s, count);
            if (min > length)
                min = length;
        }
        return min;
    }

    private int findLength(String s, int count) {
        int length = 0;
        String before = "";
        boolean isFirst = true;
        for (int i = 0; i < s.length(); i += count) {
            if(i+count > s.length())
                return length + (s.length()-i);
            if (!before.equals(s.substring(i, i + count))) {
                before = s.substring(i, i + count);
                length += count;
                isFirst = true;
            } else {
                if (isFirst)
                    length += 1;
                isFirst = false;
            }
        }
        return length;
    }
}