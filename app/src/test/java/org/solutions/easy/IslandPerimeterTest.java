package org.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class IslandPerimeterTest {

    public static Stream<Arguments> provideIslandPerimeterTestCases() {
        return Stream.of(
                Arguments.of(new int[][]{{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}}, 16),
                Arguments.of(new int[][]{{1}}, 4),
                Arguments.of(new int[][]{{1, 0}}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("provideIslandPerimeterTestCases")
    void islandPerimeter(int[][] grid, int expected) {
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        var actual = islandPerimeter.islandPerimeter(grid);

        assertThat(actual).isEqualTo(expected);
    }
}