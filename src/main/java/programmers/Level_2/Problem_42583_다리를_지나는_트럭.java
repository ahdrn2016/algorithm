package programmers.Level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_42583_다리를_지나는_트럭 {
    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Integer> bridge = new LinkedList<>();
            int time = 0, totalWeightOnBridge = 0;
            for(int truck : truck_weights) {
                while(true) {
                    time++;
                    if(bridge.size() == bridge_length) {
                        totalWeightOnBridge -= bridge.poll();
                    }
                    if(totalWeightOnBridge + truck <= weight) {
                        bridge.offer(truck);
                        totalWeightOnBridge += truck;
                        break;
                    } else {
                        bridge.offer(0);
                    }
                }
            }

            time += bridge_length;
            return time;
        }
    }
}
