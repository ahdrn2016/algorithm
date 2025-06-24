package programmers.Level_1;

import java.util.HashMap;
import java.util.Map;

public class Problem_42576_완주하지_못한_선수 {
    class Solution {
        public String solution(String[] participant, String[] completion) {
            Map<String, Integer> map = new HashMap<>();

            for (String p : participant) {
                map.put(p, map.getOrDefault(p, 0) + 1);
            }

            for (String c : completion) {
                map.put(c, map.get(c) - 1);
            }

            String answer = "";
            for (String key : map.keySet()) {
                if (map.get(key) != 0) {
                    answer = key;
                }
            }
            return answer;
        }
    }
}
