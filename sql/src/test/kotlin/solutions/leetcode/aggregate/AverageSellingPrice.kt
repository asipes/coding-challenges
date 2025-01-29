package solutions.leetcode.aggregate

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AverageSellingPrice : SQLTest() {

    @Test
    fun run() {
        setup("aggregate/average_selling_price_setup.sql")
        val actual = executeQuery("aggregate/average_selling_price_query.sql")

        val expected = listOf(
            mapOf("product_id" to 1, "average_price" to 6.96),
            mapOf("product_id" to 2, "average_price" to 16.96)
        )
        assertEquals(expected, actual)
    }
}