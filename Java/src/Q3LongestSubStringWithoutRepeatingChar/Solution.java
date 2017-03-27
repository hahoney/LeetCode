package Q3LongestSubStringWithoutRepeatingChar;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Use a hashmap to store the {character, position}
 * 2. Use left and right pointer to maintain a slide window.
 * 3. If right pt hit character that is in map, slide the left pt to the right of repeated char position.
 * 4. continue
 * Edge case: left pt should not move back. The hashmap keeps growing but only those elements in the slide window
 * are valid for checking repeat.
 *
 * Created by zhangyi on 3/25/17.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char readChar = s.charAt(right);
            if (map.containsKey(readChar)) {
                left = Math.max(map.get(readChar) + 1, left);
            }
            map.put(readChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
