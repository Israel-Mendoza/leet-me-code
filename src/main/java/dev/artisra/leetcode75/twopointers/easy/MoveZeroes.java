package dev.artisra.leetcode75.twopointers.easy;

/**
 * Solution for LeetCode problem 283 - Move Zeroes.
 * This class provides a method to move all zeros in an array to the end while maintaining
 * the relative order of non-zero elements.
 *
 * @see <a href="https://leetcode.com/problems/move-zeroes/description/">Problem Description on LeetCode</a>
 */
public class MoveZeroes {

    /**
     * Moves all zeros to the end of the array while maintaining the relative order of non-zero elements.
     * This operation is performed in-place without creating a copy of the array.
     *
     * Time Complexity: O(n) where n is the length of the array
     * Space Complexity: O(1) as it's done in-place
     *
     * @param nums the array to be modified, containing integers including zeros
     *
     * Example:
     * Input: [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
        int currentIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (value != 0) {
                nums[i] = nums[currentIndex];
                nums[currentIndex] = value;
                currentIndex++;
            }
        }
    }
}
