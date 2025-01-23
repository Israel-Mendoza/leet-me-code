package dev.artisra.topinterview150.arrayandstrings;

/**
 * Solution for removing all occurrences of a specified value from an array in-place.
 * @see <a href="https://leetcode.com/problems/remove-element/description/">Problem Description on LeetCode</a>
 */
public class RemoveElement {
    /**
     * Removes all occurrences of a specified value from the array in-place.
     * The relative order of the elements not equal to val is maintained.
     *
     * @param nums the input array to be modified
     * @param val the value to be removed
     * @return the number of elements in nums which are not equal to val
     */
    public int removeElement(int[] nums, int val) {
        int availableIndex = 0;

        for (int num : nums) {
            if (num != val) {
                nums[availableIndex] = num;
                availableIndex++;
            }
        }

        return availableIndex;
    }
}
