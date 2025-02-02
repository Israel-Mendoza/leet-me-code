package dev.artisra.topinterview150.arrayandstrings.easy;

/**
 * Solution for finding the length of the last word in a string.
 * Handles strings with multiple spaces, including trailing spaces.
 * @see <a href="https://leetcode.com/problems/length-of-last-word/description/">Problem Description on LeetCode</a>
 */
public class LengthOfLastWord {

    /**
     * Returns the length of the last word in the given string.
     * A word is defined as a sequence of non-space characters.
     * The method scans the string from right to left until it finds
     * a complete word, handling any trailing spaces.
     *
     * @param s the input string containing words separated by spaces
     * @return the length of the last word in the string
     *
     * Example:
     * Input: "Hello World  "
     * Output: 5 (length of "World")
     */
    public int lengthOfLastWord(String s) {
        boolean foundLetter = false;
        int wordLength = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (foundLetter) break;
            } else {
                foundLetter = true;
                wordLength++;
            }
        }
        return wordLength;
    }
}
