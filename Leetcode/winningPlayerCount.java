package Leetcode;
class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        java.util.Map<Integer, java.util.Map<Integer, Integer>> count = new java.util.HashMap<>();
        
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];
            count.computeIfAbsent(player, k -> new java.util.HashMap<>()).merge(color, 1, Integer::sum);
        }
        
        int winners = 0;
        for (int i = 0; i < n; i++) {
            if (count.containsKey(i)) {
                for (int colorCount : count.get(i).values()) {
                    if (colorCount > i) {
                        winners++;
                        break;
                    }
                }
            }
        }
        
        return winners;
    }}
