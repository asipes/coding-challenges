package solutions.leetcode.select.advanced

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class ConsecutiveNumbers : SQLTest() {

    @Test
    fun run() {
        setup("select/advanced/consecutive_numbers_setup.sql")
        val actual = executeQuery("select/advanced/consecutive_numbers_query.sql")

        val expected = listOf(
            mapOf("ConsecutiveNums" to 1),
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}