package dev.artisra.topinterview150.arrayandstrings.easy;

/**
 * Solution for finding the majority element in an array.
 * Implements Boyer-Moore Voting Algorithm to find the element that appears
 * more than n/2 times in the array, where n is the size of the array.
 * @see <a href="https://leetcode.com/problems/majority-element/description/">Problem Description on LeetCode</a>
 */
public class MajorityElement {

    /**
     * Finds the majority element in an array using Boyer-Moore Voting Algorithm.
     * A majority element is defined as an element that appears more than n/2 times
     * in the array, where n is the array length.
     *
     * @param nums the input array containing integers where a majority element is guaranteed to exist
     * @return the majority element that appears more than n/2 times
     */
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int count = 0;

        for (int num : nums) {
            if (num == element) {
                count++;
                continue;
            }

            count--;
            if (count == 0) {
                element = num;
                count++;
            }
        }

        return element;
    }
}

