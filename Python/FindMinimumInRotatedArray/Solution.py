class Solution:
    # does not apply to arrays with duplicates
    # @param num, a list of integer
    # @return an integer
    def findMin(self, num):
        if num is None:
            return None
        begin = 0
        end = len(num) - 1

        while begin < end:
            mid = begin + (end - begin) / 2
            if num[mid] < num[end]:
                end = mid
            elif num[mid] >= num[begin]:
                begin = mid + 1
            else:
                break
        return num[begin]


