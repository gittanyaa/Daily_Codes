package Leetcode;

class Solution {
    public int getMaximumGold(int[][] grid) {
        
        int maxGold = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    maxGold = Math.max(maxGold, dfs(grid, i, j));
                }
            }
        }
        return maxGold;
    }

    private int dfs(int[][] grid, int i, int j) {
// Boundary check and check if the cell is already visited or contains 0 gold
if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        int gold = grid[i][j];
// Mark this cell as visited 
        grid[i][j] = 0;

        //all 4 directions
        int left = dfs(grid, i, j - 1);
        int right = dfs(grid, i, j + 1);
        int up = dfs(grid, i - 1, j);
        int down = dfs(grid, i + 1, j);

// revert the cell back to its original value
        grid[i][j] = gold;
 //  Return the gold collected from this cell plus the maximum gold collected from its neighbors
        return gold + Math.max(Math.max(left, right), Math.max(up, down));
    }
}

    