package solutions.leetcode.join

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ManagersWithAtLeast5DirectReports : SQLTest() {

    @Test
    fun run() {
        setup("join/managers_with_at_least_5_direct_reports_setup.sql")
        val actual = executeQuery("join/managers_with_at_least_5_direct_reports_query.sql")

        val expected = listOf(
            mapOf("name" to "John")
        )
        assertEquals(expected, actual)
    }
}