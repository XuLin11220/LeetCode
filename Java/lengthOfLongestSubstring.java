package Java;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public int solution(String s) {
        int longest = 0, left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                longest = Math.max(longest, set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return longest;
    }
}
