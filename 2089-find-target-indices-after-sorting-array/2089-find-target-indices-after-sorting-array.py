class Solution:
    def targetIndices(self, nums: List[int], target: int) -> List[int]:
        nums.sort()
        y=[]
        for i in range(len(nums)):
            if nums[i]==target:
                x=i
                y.append(x)

        return y
        