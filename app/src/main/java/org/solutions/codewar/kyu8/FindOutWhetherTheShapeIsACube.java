package org.solutions.codewar.kyu8;

/**
 * <a href="https://www.codewars.com/kata/58d248c7012397a81800005c/train/java">Find out whether the shape is a cube</a>
 */

public class FindOutWhetherTheShapeIsACube {
    public static boolean isCube(int volume, int side) {
        if (volume <= 0 || side <= 0) {
            return false;
        }
        return side * side * side == volume;
    }
}
