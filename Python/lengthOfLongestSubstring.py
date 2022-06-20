class Solution(object):
    def lengthOfLongestSubstring(self, s):
        l = 0; r = 0; res= 0
        Set = set()
        while r < len(s):
            if s[r] not in Set:
                Set.add(s[r])
                r += 1
                res = max(res, len(Set))
            else:
                Set.remove(s[l])
                l += 1

        return res