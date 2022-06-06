class remove(object):
    def removeElement(self, nums, val):
        x = 0
        for i in nums:
            if i != val:
                nums[x] = i
                x += 1
        return x 
