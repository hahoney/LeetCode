package TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangyi on 12/14/16.
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums == null || nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (sumMap.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = sumMap.get(target - nums[i]);
                return result;
            }
            sumMap.put(nums[i], i);
        }
        return null;
    }
}
