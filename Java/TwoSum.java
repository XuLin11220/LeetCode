package Java;

public class TwoSum {
    public int[] twoSums(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int[] ans = new int[2];
        while (left <= right) {
            int num = numbers[left] + numbers[right];
            if (num == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                break;
            } else if (num < target) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}