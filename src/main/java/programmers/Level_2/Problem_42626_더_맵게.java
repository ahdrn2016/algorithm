package programmers.Level_2;

import java.util.PriorityQueue;

public class Problem_42626_더_맵게 {
    class Solution {
        public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int x : scoville) {
                pq.offer(x);
            }

            int answer = 0;
            while(pq.peek() < K) {
                if(pq.size() == 1) {
                    return -1;
                }
                pq.offer(pq.poll() + (pq.poll() * 2));
                answer++;
            }

            return answer;
        }
    }
}
