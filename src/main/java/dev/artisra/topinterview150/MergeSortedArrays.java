package dev.artisra.topinterview150;

/**
 * Solution for LeetCode problem: Merge Sorted Array
 * This class provides functionality to merge two sorted arrays into one.
 * The first array (nums1) has enough space at the end to accommodate all elements
 * from the second array (nums2).
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/description/">Problem Descripton on LeetCode</a>
 */
class MergeSortedArrays {
    /**
     * Merges two sorted integer arrays by modifying the first array in-place.
     * The merge is performed in a non-decreasing order, starting from the end
     * of the arrays to avoid overwriting elements that are still needed.
     *
     * @param nums1 The first sorted array with extra space at the end to accommodate nums2
     * @param m The number of actual elements in nums1 (excluding the extra space)
     * @param nums2 The second sorted array to be merged into nums1
     * @param n The number of elements in nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;

        int index1 = m - 1;
        int index2 = n - 1;

        for (int currentIndex = nums1.length - 1; currentIndex >= 0; currentIndex--) {
            int firstArrayValue = getValueFromArray(nums1, index1);
            int secondArrayValue = getValueFromArray(nums2, index2);
            if (secondArrayValue >= firstArrayValue) {
                nums1[currentIndex] = secondArrayValue;
                index2--;
            } else {
                nums1[currentIndex] = firstArrayValue;
                index1--;
            }
        }
    }

    /**
     * Helper method to safely get a value from an array.
     * Returns Integer.MIN_VALUE if the index is negative, which helps handle edge cases
     * when one of the arrays is exhausted.
     *
     * @param array The array to get the value from
     * @param index The index from which to retrieve the value
     * @return The value at the specified index, or Integer.MIN_VALUE if index is negative
     */
    private int getValueFromArray(int[] array, int index) {
        return index < 0 ? Integer.MIN_VALUE : array[index];
    }
}
