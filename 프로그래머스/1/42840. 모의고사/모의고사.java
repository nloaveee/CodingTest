import java.util.ArrayList;
import java.util.List;


class Solution {
        public List<Integer> solution(int[] answers) {
        // 1. 수포자가 찍는 패턴
        int[] one = {1,2,3,4,5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 2. 맞춘 개수를 담을 배열
        int[] score = new int[3];

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i%5]) score[0]++;
            if (answers[i] == two[i%8]) score[1]++;
            if (answers[i] == three[i%10]) score[2]++;
        }

        // 3. 가장 많이 맞춘 개수
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> list = new ArrayList<>();

        // 4. 가장 많이 맞춘 사람 담기 (오름차순)
        for (int i = 0; i < 3; i++) {
            if (maxScore == score[i]) list.add(i + 1);
        }

        return list;
    }
}