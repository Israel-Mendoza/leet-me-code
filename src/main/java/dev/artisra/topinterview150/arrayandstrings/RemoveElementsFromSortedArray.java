package dev.artisra.topinterview150.arrayandstrings;

/**
 * Solution for removing duplicates from a sorted array problem.
 * This class provides functionality to remove duplicates from a sorted array in-place
 * while maintaining the relative order of unique elements.
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">Problem Description on LeetCode</a>
 */
public class RemoveElementsFromSortedArray {

    /**
     * Removes duplicates from a sorted array in-place and returns the number of unique elements.
     * The first k elements of the modified array will contain the unique elements in sorted order,
     * where k is the number of unique elements.
     *
     * @param nums the input array sorted in non-decreasing order
     * @return the number of unique elements in the modified array
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;

        int lastUnique = nums[0];
        int availableIndex = 1;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num != lastUnique) {
                nums[availableIndex] = num;
                lastUnique = num;
                availableIndex++;
            }
        }

        return availableIndex;
    }
}
