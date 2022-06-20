from turtle import left


class Solution(object):
    def trap(self, height):
        l, r = 0, len(height) - 1
        leftmax, rightmax = height[l], height[r]
        ans = 0

        while l < r:
            if leftmax < rightmax:
                l += 1
                leftmax = max(leftmax, height[l])
                ans += leftmax - height[l]
            else:
                r -= 1
                rightmax = max(rightmax, height[r])
                ans += rightmax - height[r]

        return ans