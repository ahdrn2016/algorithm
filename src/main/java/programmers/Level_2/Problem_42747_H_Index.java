package programmers.Level_2;

import java.util.Arrays;

public class Problem_42747_H_Index {
    class Solution {
        public int solution(int[] citations) {
            // 배열을 오름차순으로 정렬
            Arrays.sort(citations);

            int n = citations.length;

            int answer = 0;
            for (int i = 0; i < n; i++) {
                // h는 현재 논문 이상 인용된 논문의 수
                int h = n - i;

                // h가 현재 논문의 인용 횟수보다 작거나 같으면 H-Index
                if (citations[i] >= h) {
                    answer = h;
                }
            }

            // 모든 경우를 확인했는데도 만족하지 않으면 H-Index는 0
            return answer;
        }
    }
}
