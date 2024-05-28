class Solution {
        public int[] solution(long n) {
            String str = "" + n; // String으로 해줌
            int[] answer = new int[str.length()];
            int count = 0;

            while (n > 0) {
                answer[count] = (int)(n % 10);
                n /= 10;
                count++;
            }
            return answer;
        }
    }