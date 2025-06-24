package programmers.Level_1;

import java.util.ArrayList;
import java.util.List;

public class Problem_12906_같은_숫자는_싫어 {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();

        int prev = -1;
        for (int num : arr) {
            if (prev != num) {
                result.add(num);
                prev = num;

            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
