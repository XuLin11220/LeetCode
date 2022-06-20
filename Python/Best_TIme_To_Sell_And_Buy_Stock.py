class Solution(object):
    def maxProfit(self, prices):
        ans = 0
        l = 0

        for i in range(1, len(prices)):
            if prices[i] < prices[l]:
                l = i
            ans = max(ans, prices[i] - prices[l])

        return ans