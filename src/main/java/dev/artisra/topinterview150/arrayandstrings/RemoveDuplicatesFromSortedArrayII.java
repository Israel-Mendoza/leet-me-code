package dev.artisra.topinterview150.arrayandstrings;

/**
 * Solution for LeetCode problem 80 - Remove Duplicates from Sorted Array II.
 * This class provides a method to remove duplicates from a sorted array such that
 * each element appears at most twice.
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/">Problem Description on LeetCode</a>
 */
public class RemoveDuplicatesFromSortedArrayII {

    /**
     * Removes duplicates from a sorted array such that each element appears at most twice.
     * Modifies the array in-place and returns the number of valid elements.
     *
     * Time Complexity: O(n) where n is the length of the array
     * Space Complexity: O(1) as it's done in-place
     *
     * @param nums the sorted array to be modified
     * @return the number of elements after removing excess duplicates
     *
     * Example:
     * Input: nums = [1,1,1,2,2,3]
     * Output: 5, nums = [1,1,2,2,3,_]
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int availableIndex = 1;
        int count = 1;
        int last = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentNumber = nums[i];

            if (currentNumber != last) {
                nums[availableIndex] = currentNumber;
                count = 1;
                last = currentNumber;
                availableIndex++;
                continue;
            }

            if (count < 2) {
                nums[availableIndex] = currentNumber;
                count++;
                availableIndex++;
            }
        }

        return availableIndex;
    }
}
