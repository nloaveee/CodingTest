class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            answer = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
            if (answer > (2*a*b)) {
                return answer;
            }else{
                return 2*a*b;
            }
        }
    }