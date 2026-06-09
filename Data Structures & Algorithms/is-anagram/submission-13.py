class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): 
            return False

        a = []
        b = []
        for i in range(len(s)):
            a.append(s[i])
            b.append(t[i])
        
        return sorted(a) == sorted(b)


        