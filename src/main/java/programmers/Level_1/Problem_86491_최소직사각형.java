package programmers.Level_1;

public class Problem_86491_최소직사각형 {
    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0, max = 0, min = 0;
            for(int[] card : sizes) {
                max = Math.max(max, Math.max(card[0], card[1]));
                min = Math.max(min, Math.min(card[0], card[1]));
            }
            answer = max * min;
            return answer;
        }
    }
}
