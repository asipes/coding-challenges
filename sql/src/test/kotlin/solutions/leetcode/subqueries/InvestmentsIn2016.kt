package solutions.leetcode.subqueries

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class InvestmentsIn2016 : SQLTest() {

    @Test
    fun run() {
        setup("subqueries/investments_in_2016_setup.sql")
        val actual = executeQuery("subqueries/investments_in_2016_query.sql")

        val expected = listOf(
            mapOf("tiv_2016" to BigDecimal("45.00"))
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}