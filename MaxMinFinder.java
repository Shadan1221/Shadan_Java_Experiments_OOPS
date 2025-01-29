package Experiment3;
public class MaxMinFinder {
    public static int[] findMaxMin(int[] nums) {
        int max = nums[0], min = nums[0];
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return new int[]{max, min};
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 7, 2, 9, 3};
        int[] result = findMaxMin(nums);
        System.out.println("Max: " + result[0] + ", Min: " + result[1]);
    }
}