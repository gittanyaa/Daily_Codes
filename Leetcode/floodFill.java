package Leetcode;

public class floodFill {
    

    public class FloodFill {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int originalColor = image[sr][sc];

            if (originalColor == newColor) {
                return image;
            }

            int rows = image.length;
            int cols = image[0].length;

            java.util.Queue<int[]> queue = new java.util.LinkedList<>();
            queue.add(new int[]{sr, sc}); 

            image[sr][sc] = newColor;

            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

            while (!queue.isEmpty()) {
                int[] pixel = queue.poll();
                int r = pixel[0];
                int c = pixel[1];

                for (int[] dir : directions) {
                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && image[nr][nc] == originalColor) {
                        queue.add(new int[]{nr, nc});
                        image[nr][nc] = newColor; 
                    }
                }
            }

            return image; }}}



