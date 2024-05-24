import java.util.*;

    class Solution {
        public int solution(int N) {
            String str = String.valueOf(N);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int number = str.charAt(i)-'0';
            sum+=number;
        }

        return sum;
        }
    }