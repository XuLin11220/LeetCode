import numbers


class removeDumplicates(Object):
    def remove(self, nums):
        j = 1
        for i in range(len(nums)-1):
            if(nums[i] != nums[i+1]):
                nums[j] = nums[i+1]
                j += 1
        
        return j