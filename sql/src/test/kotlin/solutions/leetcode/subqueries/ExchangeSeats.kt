package solutions.leetcode.subqueries

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class ExchangeSeats : SQLTest() {

    @Test
    fun run() {
        setup("subqueries/exchange_seats_query.sql")
        val actual = executeQuery("subqueries/exchange_seats_setup.sql")

        val expected = listOf(
            mapOf("id" to 1, "student" to "Doris"),
            mapOf("id" to 2, "student" to "Abbot"),
            mapOf("id" to 3, "student" to "Green"),
            mapOf("id" to 4, "student" to "Emerson"),
            mapOf("id" to 5, "student" to "Jeames")
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}