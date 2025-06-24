package programmers.Level_1;

import java.util.HashSet;

public class Problem_1845_폰켓몬 {
    class Solution {
        public int solution(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int n : nums) {
                set.add(n);
            }

            return Math.min(nums.length / 2, set.size());
        }
    }
}
