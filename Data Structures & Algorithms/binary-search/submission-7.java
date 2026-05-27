class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if (nums.length == 1 && nums[0] == target) return 0;
        while (left < right) {
            if (nums[left] != target && nums[right] != target) {
                left++;
                right--;
                continue;
            }
            else if (nums[left] == target) return left;
            else return right;
        }
        if (nums[left] == target) return left;
        return -1;
    }
}
