package programmers.Level_2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Problem_42587_프로세스 {
    class Solution {
        public int solution(int[] priorities, int location) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int p : priorities) {
                pq.offer(p);
            }

            int answer = 0;
            while (!pq.isEmpty()) {
                for (int i = 0; i < priorities.length; i++) {
                    if (pq.peek() == priorities[i]) {
                        pq.poll();
                        answer++;

                        if (i == location) return answer;
                    }
                }
            }

            return answer;
        }
    }
}
