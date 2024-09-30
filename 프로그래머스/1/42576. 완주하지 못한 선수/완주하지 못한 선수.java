import java.util.*;
class Solution {
        public String solution(String[] participant, String[] completion) {
            // 1. 배열 정렬
            Arrays.sort(participant);
            Arrays.sort(completion);

            // 2. 비교
            int i=0;
            for (; i<completion.length; i++) {
                if (!completion[i].equals(participant[i])){
                    break;
                }
            }

            return participant[i];
        }
    }