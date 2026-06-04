class Solution {
    //O(n + m) complexity -- Runtime: 123ms ; Memory: 63.2MB
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = 0;
        return backtrack(r, c, matrix, target);
    }

    public boolean backtrack(int r, int c, int[][] matrix, int target) {
        if (r >= matrix.length) return false;
        if (c > matrix[0].length - 1) return false;

        if (target > matrix[r][matrix[0].length - 1]) 
            return backtrack(++r, c, matrix, target);

        if (matrix[r][c] == target) return true;
        return backtrack(r, ++c, matrix, target);
    }
}
