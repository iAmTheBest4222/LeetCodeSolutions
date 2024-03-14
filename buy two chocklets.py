class Solution:
    def buyChoco(self, prices, money):
        prices.sort()
        if prices[0] + prices[1] <= money:
            return money - (prices[0] + prices[1])
        return money