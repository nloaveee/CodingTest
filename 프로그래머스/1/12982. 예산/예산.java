import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;

        Arrays.sort(d); // 1. d 배열 정렬

        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                continue;
            }
            answer++;
        }

        return answer;
    }
}