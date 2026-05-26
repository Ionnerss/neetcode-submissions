class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> a = new HashSet<>();

        for (int e : nums) {
            if (a.contains(e)) return true;
            a.add(e);
        }
        return false;
    }
}