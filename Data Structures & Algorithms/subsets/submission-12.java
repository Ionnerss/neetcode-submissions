class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        a.add(new ArrayList<>());

        if (nums.length == 0) return a;

        for (int i = 0; i < nums.length; i++) {
            List<Integer> copy = new ArrayList<>(a.get(0));
            copy.add(nums[i]);
            a.add(copy);

            int csize = a.size();
            for (int j = 1; j < csize; j++) {
                copy = new ArrayList<>(a.get(j));
                if (copy.get(0) == nums[i]) continue;
                copy.add(nums[i]);
                a.add(copy);
            }
        }

        return a;
    }
}
