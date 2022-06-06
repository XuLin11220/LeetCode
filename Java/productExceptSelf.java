package Java;

public class productExceptSelf {
    public int[] productExceptSelfs(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
        }
        return res;
    }
}
