import java.util.*;
class Solution {
        public String solution(String[] participant, String[] completion) {

            String answer = "";
            // 1. hash에 넣기
            Map<String, Integer> map = new HashMap<>();

            for (String human : participant) {
                map.put(human,map.getOrDefault(human,0)+1);
            }

            // 2. completion 값 빼기
            for (String human : completion) {
                map.put(human,map.get(human)-1);
            }

            // 3. value 가 0이 아닌 값 가져오기
            for (String key : map.keySet()) {
                if (map.get(key) != 0) {
                    answer = key;
                    break;
                }
            }

            return answer;



//            // 1. 배열 정렬
//            Arrays.sort(participant);
//            Arrays.sort(completion);
//
//            // 2. 비교
//            int i=0;
//            for (; i<completion.length; i++) {
//                if (!completion[i].equals(participant[i])){
//                    break;
//                }
//            }
//
//            return participant[i];
        }
    }