import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i<want.length; i++) {
            wantMap.put(want[i],number[i]);
        }

        int day = 10;
        for (int i = 0; i<=discount.length - day; i++) {
            Map<String, Integer> currentMap = new HashMap<>();

            for (int j = i; j < i+day; j++) {
                currentMap.put(discount[j], currentMap.getOrDefault(discount[j], 0) + 1);
            }

            // 원하는 상품 조건 만족 여부 확인
            boolean isMatch = true;
            for (String key : wantMap.keySet()) {
                if (currentMap.getOrDefault(key, 0) < wantMap.get(key)) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                answer++;
            }
        }
        return answer;
    }
}