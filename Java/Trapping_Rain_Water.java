package Java;

public class Trapping_Rain_Water {
    public int trap(int[] height) {
        int max_rain = 0;
        int max = height[0];
        int max_left[] = new int[height.length], max_right[] = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            max_left[i] = Math.max(height[i], max);
            max = max_left[i];
        }

        max = height[height.length - 1];

        for (int i = height.length - 1; i >= 0; i--) {
            max_right[i] = Math.max(height[i], max);
            max = max_right[i];
        }

        for (int i = 0; i < height.length; i++) {
            max_rain = max_rain + Math.min(max_left[i], max_right[i]) - height[i];
        }

        return max_rain;
    }
}