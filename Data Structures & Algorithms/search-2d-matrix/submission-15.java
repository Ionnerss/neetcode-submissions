class Solution {
    //O(log(r*c)) complexity
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = 0;
        return backtrackLog(r, c, matrix, target);
    }

    public boolean backtrackLog(int r, int c, int[][] matrix, int target) {
        if (r >= matrix.length) return false;
        if (c > matrix[0].length - 1) return false;

        if (target > matrix[r][matrix[0].length - 1]) 
            return backtrackLog(++r, c, matrix, target);

        if (matrix[r][c] == target) return true;
        return backtrackLog(r, ++c, matrix, target);
    }
}
