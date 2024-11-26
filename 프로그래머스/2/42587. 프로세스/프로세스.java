import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int count = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i =0; i<priorities.length; i++) {
            pq.add(priorities[i]);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    count++;
                    if (i == location) {
                        return count;
                    }
                    pq.poll();
                }
            }
        }

        return 0;
    }
}