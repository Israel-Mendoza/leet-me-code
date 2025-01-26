package dev.artisra.topinterview150.arrayandstrings;

import java.util.Map;

/**
 * Solution for converting Roman numerals to integers.
 * Handles standard Roman numeral rules including subtraction cases (IV, IX, XL, XC, CD, CM).
 *
 * @see <a href="https://leetcode.com/problems/roman-to-integer/description/">Problem Description on LeetCode</a>
 */
public class RomanToInt {
    private static final Map<Character, Integer> CHAR_VALUES = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    /**
     * Converts a Roman numeral string to its integer value.
     * Uses a right-to-left scanning approach to handle subtraction cases.
     * When a smaller value precedes a larger value, it represents subtraction
     * (e.g., IV = 4, IX = 9, XL = 40, etc.).
     *
     * @param s the Roman numeral string to convert
     * @return the integer value of the Roman numeral
     *
     * Examples:
     * "III" -> 3
     * "IV" -> 4
     * "IX" -> 9
     * "LVIII" -> 58
     * "MCMXCIV" -> 1994
     */
    public int romanToInt(String s) {
        int lastDigit = CHAR_VALUES.get(s.charAt(s.length() - 1));
        int sum = lastDigit;

        for (int i = s.length() - 2; i >= 0; i--) {
            int currentValue = CHAR_VALUES.get(s.charAt(i));
            if (currentValue < lastDigit) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }

            lastDigit = currentValue;
        }

        return sum;
    }
}

