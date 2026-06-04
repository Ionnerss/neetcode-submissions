class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = 0;
        return backtrack(r, c, matrix, target);
    }

    public boolean backtrack(int r, int c, int[][] matrix, int target) {
        if (r >= matrix.length) return false;
        if (c >= matrix[0].length) { 
            r++;
            c = 0;
            return backtrack(r, c, matrix, target);
        }
        if (matrix[r][c] == target) return true;
        return backtrack(r, ++c, matrix, target);
    }
}
