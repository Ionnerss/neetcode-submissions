class Solution {
    //O(n log(m)) complexity -- Runtime: 128ms ; Memory: 62.4MB
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = 0;
        return backtrack(r, c, matrix, target);
    }

    public boolean backtrack(int r, int c, int[][] matrix, int target) {
        if (r >= matrix.length) return false;
        if (c > matrix[0].length - 1) return false;

        if (target > matrix[r][matrix[0].length - 1]) 
            return backtrack(++r, c, matrix, target);

        int left = 0, right = matrix[0].length - 1, m = 0;

        while (left <= right) {
            m = (left + right) / 2;
            if (m < matrix[0].length && target > matrix[r][m]) left = m + 1;
            else if (m < matrix[0].length && target < matrix[r][m]) right = m - 1;
            else return true;
        }
        return false;
    }
}
