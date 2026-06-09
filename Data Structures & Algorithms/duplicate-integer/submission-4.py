class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        s = set()
        for i in nums:
            if s.__contains__(i): return True
            s.add(i)
        return False