package programmers.Level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_12909_올바른_괄호 {
    class Solution {
        boolean solution(String s) {
            Queue<Character> queue = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    queue.offer(s.charAt(i));
                } else {
                    if (queue.isEmpty()) return false;
                    else queue.poll();
                }
            }
            return queue.isEmpty();
        }
    }
}
