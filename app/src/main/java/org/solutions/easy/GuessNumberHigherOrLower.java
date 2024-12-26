package org.solutions.easy;

import org.model.GuessGame;

/**
 * <a href="https://leetcode.com/problems/guess-number-higher-or-lower/submissions/">374. Guess Number Higher or Lower: 0ms(100%), 40.56mb(28.95%) </a>
 */

public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
