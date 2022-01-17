package leetCode.DailyChallenge._2022.JAN;

import java.util.HashMap;
import java.util.Map;

/**
 * @docs https://leetcode.com/problems/word-pattern/
 * <p>
 * Given a pattern and a string s, find if s follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * Example 2:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * Example 3:
 * <p>
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= pattern.length <= 300
 * pattern contains only lower-case English letters.
 * 1 <= s.length <= 3000
 * s contains only lowercase English letters and spaces ' '.
 * s does not contain any leading or trailing spaces.
 * All the words in s are separated by a single space.
 */
public class _17JAN2022_WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        Map map = new HashMap();

        for (Integer i = 0; i < words.length; ++i)
            if (map.put(pattern.charAt(i), i) != map.put(words[i], i))
                return false;
        return true;
    }
}
