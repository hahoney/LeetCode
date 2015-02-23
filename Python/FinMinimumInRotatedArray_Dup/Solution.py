class Solution:
    # @param num, a list of integer
    # @return an integer
    def findMin(self, num):
        if num is None:
            return None
        begin = 0
        end = len(num) - 1
        min_dup = num[begin]

        while begin < end:
            # unrotated case
            if num[begin] < num[end]:
                return num[begin] if num[begin] < min_dup else min_dup
            # rotated array
            # we cannot tell whether go left or right
            # when num[mid] == num[begin] == num[end]
            # it must be handled separately
            mid = (begin + end) / 2
            if num[begin] == num[end]:
                begin += 1
                end -= 1
                min_dup = min_dup if min_dup < num[begin] else num[begin]
            elif num[mid] <= num[end]:
                end = mid
            elif num[mid] >= num[begin]:
                begin = mid + 1
        return num[end] if num[end] < min_dup else min_dup