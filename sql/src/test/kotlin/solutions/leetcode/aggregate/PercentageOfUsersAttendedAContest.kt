package solutions.leetcode.aggregate

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class PercentageOfUsersAttendedAContest : SQLTest() {

    @Test
    fun run() {
        setup("aggregate/percentage_of_users_attended_a_contest_setup.sql")
        val actual = executeQuery("aggregate/percentage_of_users_attended_a_contest_query.sql")

        val expected = listOf(
            mapOf("contest_id" to 208, "percentage" to BigDecimal("100.00")),
            mapOf("contest_id" to 209, "percentage" to BigDecimal("100.00")),
            mapOf("contest_id" to 210, "percentage" to BigDecimal("100.00")),
            mapOf("contest_id" to 215, "percentage" to BigDecimal("66.67")),
            mapOf("contest_id" to 207, "percentage" to BigDecimal("33.33"))
        )
        assertEquals(expected, actual)
    }
}