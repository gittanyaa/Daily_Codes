package Leetcode;

class Solution {
    public int numEnclaves(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i=0;i<m;i++){
            searching(i, 0, grid, m, n);
            searching(i, n-1, grid, m, n);
        }

        for(int j=0;j<n;j++){
            searching(0, j, grid, m, n);
            searching(m-1 , j, grid, m, n);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    public void searching (int i, int j, int[][] grid, int m, int n){
        if(i<0 || i>=m || j<0 || j>= n || grid[i][j]==0){
            return;
        }
        grid[i][j] = 0;
        searching(i - 1, j, grid, m, n);
        searching(i + 1, j, grid, m, n);
        searching(i, j - 1, grid, m, n);
        searching(i, j + 1, grid, m, n);
    }
}