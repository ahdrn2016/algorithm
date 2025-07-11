package programmers.Level_2;

import java.util.HashMap;

public class Problem_42578_의상 {
    class Solution {
        public int solution(String[][] clothes) {
            HashMap<String, Integer> map = new HashMap<>();
            for (String[] x : clothes) {
                String key = x[1];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            int answer = 1;
            for (String key : map.keySet()) {
                answer *= map.get(key) + 1;
            }
            answer -= 1;

            return answer;
        }
    }
}
