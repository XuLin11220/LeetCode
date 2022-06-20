package Java;

import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public int longestConsecutives(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int i : nums) {
            num_set.add(i);
        }
        int count = 0;
        for (int number : num_set) {
            if (!num_set.contains(number - 1)) {
                int curr_num = number;
                int curr_count = 1;

                while (num_set.contains(curr_num + 1)) {
                    curr_num++;
                    curr_count++;
                }

                count = Math.max(count, curr_count);
            }
        }
        return count;
    }
}