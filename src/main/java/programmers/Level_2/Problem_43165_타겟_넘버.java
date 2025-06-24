package programmers.Level_2;

public class Problem_43165_타겟_넘버 {
    class Solution {
        public int solution(int[] numbers, int target) {
            return dfs(numbers, 0, 0, target);
        }

        private int dfs(int[] numbers, int depth, int sum, int target) {
            if (depth == numbers.length) {
                return sum == target ? 1 : 0;
            }
            int plus = dfs(numbers, depth + 1, sum + numbers[depth], target);
            int minus = dfs(numbers, depth + 1, sum - numbers[depth], target);

            return plus + minus;
        }
    }
}
