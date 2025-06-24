package programmers.Level_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_42586_기능개발 {
    class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < progresses.length; i++) {
                queue.offer( (int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
            }

            List<Integer> answer = new ArrayList<>();
            while (!queue.isEmpty()) {
                int current = queue.poll();
                int count = 1;

                while (!queue.isEmpty() && queue.peek() <= current) {
                    queue.poll();
                    count++;
                }
                answer.add(count);
            }
            return answer.stream().mapToInt(i -> i).toArray();
        }
    }
}
