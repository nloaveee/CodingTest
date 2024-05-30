import java.util.Arrays;   
class Solution {
        public long solution(long n) {

            String[] str = String.valueOf(n).split("");
            Arrays.sort(str); // 배열 정렬 

            StringBuilder sb = new StringBuilder();
            for(int i=str.length-1; i >= 0; i--){ // 배열의 뒤에서 부터 거꾸로 담는다.
                sb.append(str[i]);
            }

            // string -> long
            long answer = Long.parseLong(String.valueOf(sb));

            return answer;

        }
    }