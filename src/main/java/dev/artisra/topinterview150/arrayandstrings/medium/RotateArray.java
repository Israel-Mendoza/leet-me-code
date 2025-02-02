package dev.artisra.topinterview150.arrayandstrings.medium;

/**
 * Solution for LeetCode problem 189 - Rotate Array.
 * This class provides a method to rotate an array to the right by k steps using
 * the reversal algorithm approach.
 *
 * @see <a href="https://leetcode.com/problems/rotate-array/description/">Problem Description on LeetCode</a>
 */
public class RotateArray {

    /**
     * Rotates the array to the right by k steps using the reversal algorithm.
     * The algorithm works by:
     * 1. Handling edge cases (k > array length, k = 0)
     * 2. Reversing the last k elements
     * 3. Reversing the first n-k elements
     * 4. Reversing the entire array
     *
     * Time Complexity: O(n) where n is the length of the array
     * Space Complexity: O(1) as it's done in-place
     *
     * @param nums the array to be rotated
     * @param k the number of steps to rotate right
     *
     * Example:
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     */
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) return;

        // Handle case where k > array length
        k = k % nums.length;

        if (k == 0) return;

        // Reversing the second part of the array
        reverseArrayInRange(nums, nums.length - k, nums.length - 1);
        // Reversing the first part of the array
        reverseArrayInRange(nums, 0, nums.length - k - 1);
        // Reversing the whole array
        reverseArrayInRange(nums, 0, nums.length - 1);
    }

    /**
     * Reverses a portion of the array between the specified boundaries (inclusive).
     *
     * @param array the array to be partially reversed
     * @param leftBoundary the starting index (inclusive)
     * @param rightBoundary the ending index (inclusive)
     */
    private void reverseArrayInRange(int[] array, final int leftBoundary, final int rightBoundary) {
        int left = leftBoundary;
        int right = rightBoundary;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}

