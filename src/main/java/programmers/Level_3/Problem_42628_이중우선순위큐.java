package programmers.Level_3;

import java.util.Collections;
import java.util.PriorityQueue;

public class Problem_42628_이중우선순위큐 {
    class Solution {
        public int[] solution(String[] operations) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for(String x : operations) {
                String action = x.substring(0,1);
                int num = Integer.parseInt(x.substring(2));

                if("I".equals(action)) {
                    minHeap.offer(num);
                    maxHeap.offer(num);
                }

                if("D".equals(action) && !minHeap.isEmpty()) {
                    if(num == -1) {
                        maxHeap.remove(minHeap.poll());
                    } else {
                        minHeap.remove(maxHeap.poll());
                    }
                }
            }

            if(minHeap.isEmpty()) {
                maxHeap.offer(0);
                minHeap.offer(0);
            }

            int[] answer = {maxHeap.peek(), minHeap.peek()};
            return answer;
        }
    }
}
