package solutions.leetcode.subqueries

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.math.BigDecimal
import java.sql.Date

class RestaurantGrowth : SQLTest() {

    @Test
    fun run() {
        setup("subqueries/restaurant_growth_setup.sql")
        val actual: List<Map<String, Any>> = executeQuery("subqueries/restaurant_growth_query.sql")

        val expected = listOf(
            mapOf<String, Any>(
                "visited_on" to Date.valueOf("2019-01-07"),
                "amount" to 860L,
                "average_amount" to BigDecimal("122.86")
            ),
            mapOf<String, Any>(
                "visited_on" to Date.valueOf("2019-01-08"),
                "amount" to 840L,
                "average_amount" to BigDecimal("120.00")
            ),
            mapOf<String, Any>(
                "visited_on" to Date.valueOf("2019-01-09"),
                "amount" to 840L,
                "average_amount" to BigDecimal("120.00")
            ),
            mapOf<String, Any>(
                "visited_on" to Date.valueOf("2019-01-10"),
                "amount" to 1000L,
                "average_amount" to BigDecimal("142.86")
            ),
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}