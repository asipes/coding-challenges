package solutions.leetcode.join

import SQLTest
import org.assertj.core.api.Assertions
import java.math.BigDecimal
import kotlin.test.Test

class ConfirmationRate : SQLTest() {

    @Test
    fun run() {
        setup("join/confirmation_rate_setup.sql")
        val actual = executeQuery("join/confirmation_rate_query.sql")

        val expected = listOf(
            mapOf("user_id" to 6, "confirmation_rate" to BigDecimal("0.00")),
            mapOf("user_id" to 3, "confirmation_rate" to BigDecimal("0.00")),
            mapOf("user_id" to 7, "confirmation_rate" to BigDecimal("1.00")),
            mapOf("user_id" to 2, "confirmation_rate" to BigDecimal("0.50"))
        )
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected)
    }
}