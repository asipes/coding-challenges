package org.solutions.easy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNAndItsDoubleExistTest {

    @ParameterizedTest
    @MethodSource("provideAnagramTestCases")
    void checkIfExist(int[] arr, boolean expected) {
        CheckIfNAndItsDoubleExist checkIfNAndItsDoubleExist = new CheckIfNAndItsDoubleExist();
        var actual = checkIfNAndItsDoubleExist.checkIfExist(arr);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideAnagramTestCases() {
        return Stream.of(
                Arguments.of(new int[]{10, 2, 5, 3}, true),
                Arguments.of(new int[]{7, 1, 14, 11}, true),
                Arguments.of(new int[]{3, 1, 7, 11}, false)
        );
    }
}