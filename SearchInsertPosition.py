class Solution(object):
    def searchInsert(self, nums, target):
        left ,right = 0, len(nums)-1
        while left <= right:
            middle = left + (right-left) // 2
            if nums[middle] == target: return middle
            if nums[middle] > target: right = middle - 1
            else: left = middle + 1
        return left
