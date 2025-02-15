package org.solutions.leetcode.easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefangingAnIPAddressTest {

    public static Stream<Arguments> provideDefangIPaddrTestCases() {
        return Stream.of(
                Arguments.of("1.1.1.1", "1[.]1[.]1[.]1"),
                Arguments.of("255.100.50.0", "255[.]100[.]50[.]0")
        );
    }

    @ParameterizedTest
    @MethodSource("provideDefangIPaddrTestCases")
    void defangIPaddr(String address, String expected) {
        var actual = new DefangingAnIPAddress().defangIPaddr(address);
        assertEquals(expected, actual);
    }
}