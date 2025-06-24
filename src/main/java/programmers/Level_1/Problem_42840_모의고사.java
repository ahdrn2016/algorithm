package programmers.Level_1;

import java.util.ArrayList;

public class Problem_42840_모의고사 {
    class Solution {
        public int[] solution(int[] answers) {
            int[][] supoja = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

            int a = 0, b = 0, c = 0;
            for(int i = 0; i < answers.length; i++) {
                if(answers[i] == supoja[0][i % supoja[0].length]) a++;
                if(answers[i] == supoja[1][i % supoja[1].length]) b++;
                if(answers[i] == supoja[2][i % supoja[2].length]) c++;
            }

            int max = Math.max(Math.max(a, b), c);
            ArrayList<Integer> list = new ArrayList<Integer>();
            if(max == a) list.add(1);
            if(max == b) list.add(2);
            if(max == c) list.add(3);

            int[] answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }

            return answer;
        }
    }
}
