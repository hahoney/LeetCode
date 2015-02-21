class Solution:
    # @param num, a list of integer
    # @return an integer
    def findMin(self, num):
        if num is None:
            return None
        begin = 0
        end = len(num) - 1

        while begin < end:
            mid = (begin + end) / 2
            if num[mid] >= num[end]:
                begin = mid + 1
            elif num[mid] <= num[begin]:
                end = mid
            else:
                return num[begin]
        return num[end]


