package org.solutions.leetcode.easy;

/**
 * <a href="https://leetcode.com/problems/determine-color-of-a-chessboard-square">812. Determine Color of a Chessboard Square</a>
 */

public class DetermineColorOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        if (coordinates.equals("a1")) {
            return false;
        }

        int row = coordinates.charAt(0) - 'a' - 1;
        int col = coordinates.charAt(1) - '0' - 1;

        return !(row % 2 != 0 && col % 2 == 0
                || row % 2 == 0 && col % 2 != 0);
    }
}
