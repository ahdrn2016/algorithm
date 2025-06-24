package programmers.Level_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem_42579_베스트앨범 {
    class Solution {
        public int[] solution(String[] genres, int[] plays) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            }

            List<String> genreList = new ArrayList<>(map.keySet());
            genreList.sort((g1, g2) -> map.get(g2)- map.get(g1));

            List<Integer> answerList = new ArrayList<>();
            for (String genre : genreList) {

                List<int[]> songs = new ArrayList<>();
                for (int i = 0; i < genres.length; i++) {
                    if (genre.equals(genres[i])) {
                        songs.add(new int[]{i, plays[i]});     // songs = {{0, 5}, {1, 100}, ...}
                    }
                }

                songs.sort((a, b) -> b[1] - a[1]);

                for (int i = 0; i < songs.size() && i < 2; i++) {
                    answerList.add(songs.get(i)[0]);
                }

            }

            return answerList.stream().mapToInt(i -> i).toArray();
        }
    }
}
