package solutions.leetcode.aggregate

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class QueriesQualityAndPercentage : SQLTest() {

    @Test
    fun run() {
        setup("aggregate/queries_quality_and_percentage_setup.sql")
        val actual = executeQuery("aggregate/queries_quality_and_percentage_query.sql")

        val expected = listOf(
            mapOf("query_name" to "Cat", "quality" to BigDecimal("0.66"), "poor_query_percentage" to BigDecimal("33.33")),
            mapOf("query_name" to "Dog", "quality" to BigDecimal("2.50"), "poor_query_percentage" to BigDecimal("33.33"))
        )
        assertEquals(expected, actual)
    }
}