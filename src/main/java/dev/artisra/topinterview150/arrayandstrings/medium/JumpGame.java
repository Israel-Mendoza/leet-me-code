package dev.artisra.topinterview150.arrayandstrings.medium;

/**
 * Solution for LeetCode problem 55 - Jump Game.
 * This class provides a method to determine if it's possible to reach the last index
 * of an array where each element represents the maximum jump length at that position.
 *
 * @see <a href="https://leetcode.com/problems/jump-game/description/">Problem Description on LeetCode</a>
 */
public class JumpGame {

    /**
     * Determines if it's possible to reach the last index of the array.
     * Uses a backwards approach by tracking the minimum position needed to reach the end.
     *
     * Time Complexity: O(n) where n is the length of the array
     * Space Complexity: O(1) as it uses only a single variable
     *
     * @param nums array where each element represents the maximum jump length at that position
     * @return true if last index is reachable, false otherwise
     *
     * Example:
     * Input: nums = [2,3,1,1,4]
     * Output: true
     */
    public boolean canJump(int[] nums) {
        // Keeping track of the goal we need to reach
        int currentGoal = nums.length - 1;

        // Traversing backwards, testing if we can reach the current goal.
        for (int i = nums.length - 2; i >= 0; i--) {
            int availableJumps = nums[i];
            if (i + availableJumps >= currentGoal) {
                currentGoal = i;
            }
        }

        return currentGoal == 0;
    }
}

