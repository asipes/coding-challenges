package org.solutions.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberContainersTest {

    @Test
    void run() {
        var container = new NumberContainers();

        var c1 = container.find(10);
        container.change(2, 10);
        container.change(1, 10);
        container.change(3, 10);
        container.change(5, 10);
        var c2 = container.find(10);
        container.change(1, 20);
        var c3 = container.find(10);

        assertEquals(-1, c1);
        assertEquals(1, c2);
        assertEquals(2, c3);
    }

}