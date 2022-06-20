package Java;

import java.util.Arrays;

public class Permutation_String {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length() || s2.length() == 0)
            return false;
        if (s1.length() == 0)
            return true;

        int[] s1map = new int[26];
        int[] s2map = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(s1map, s2map)) {
                return true;
            }
            s2map[s2.charAt(i - s1.length()) - 'a']--;
            s2map[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(s1map, s2map))
            return true;
        else
            return false;
    }
}
