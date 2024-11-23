import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
          Map<Integer, Integer> map = new HashMap<>();

        // 1. map에 각 귤에 해당하는 갯수를 저장
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        // 2. list에 map의 value를 저장
        List<Integer> list = new ArrayList<>(map.values());

        // 3. list를 내림차순으로 정렬
        list.sort(Collections.reverseOrder());

        int count = 0;
        int sum = 0;

        for (int val : list) {
            if (sum + val >= k) {
                count++;
                break;
            } else {
                sum += val;
                count++;
            }
        }

        return count;
    }
}