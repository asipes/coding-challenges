package solutions.leetcode.join

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RisingTemperature : SQLTest() {

    @Test
    fun run() {
        setup("join/rising_temperature_setup.sql")
        val actual = executeQuery("join/rising_temperature_query.sql")
        val expected = listOf(
            mapOf("id" to 2),
            mapOf("id" to 4),
        )

        assertEquals(expected, actual)
    }
}