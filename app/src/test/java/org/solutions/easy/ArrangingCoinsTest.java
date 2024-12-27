package org.solutions.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ArrangingCoinsTest {

    @ParameterizedTest
    @MethodSource("provideArrangeCoinsTestCases")
    void arrangeCoins(int n, int expected) {
        ArrangingCoins arrangingCoins = new ArrangingCoins();
        var actual = arrangingCoins.arrangeCoins(n);

        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> provideArrangeCoinsTestCases() {
        return Stream.of(
                Arguments.of(5, 2),
                Arguments.of(8, 3),
                Arguments.of(1804289383, 60070)
        );
    }
}