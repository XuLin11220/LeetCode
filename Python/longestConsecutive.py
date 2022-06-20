import logging


class Solution(object):
    def longestConsecutive(self, nums):
        hashset = set(nums)
        count = 0

        for i in nums:
            if i in hashset:
                hashset.remove(i)
                prev, next = i - 1, i + 1
                while(prev in hashset):
                    hashset.remove(prev)
                    prev -= 1
                while(next in hashset):
                    hashset.remove(next)
                    next += 1
                
                count = max(count, next - prev -1)
        
        return count

    def second_longestConsecutive(self, nums):
        num_set = set(nums)
        longest = 0
        for num in num_set:
            if num - 1 not in num_set:
                curr_num = num
                curr_count = 1
                while curr_num + 1 in num_set:
                    curr_num += 1
                    curr_count += 1
                longest = max(curr_count, longest)
            
        return longest