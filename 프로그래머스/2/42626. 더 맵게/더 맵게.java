import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
         int count =0;
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for (int i = 0; i<scoville.length; i++) {
                queue.add(scoville[i]);
            }

            // 가장 먼저 나오는 스코빌 지수가 k 보다 작으면 반복
            while (queue.peek() < K) {
                if (queue.size() == 1) return -1;
        
                queue.add(queue.poll() + (queue.poll() * 2));
                count++;
            }

            return count;
    }
}