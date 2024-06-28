import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = 0;
                sum = numbers[i] + numbers[j];
                if (answerList.contains(sum)) {
                    continue;
                } else {
                    answerList.add(sum);
                }
            }
        }
        int[] answer = new int[answerList.size()];

        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        Arrays.sort(answer);
        return answer;
    }
}
   