package solutions.leetcode.advanced

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SecondHighestSalary : SQLTest() {

    @Test
    fun run() {
        setup("advanced/second_highest_salary_setup.sql")
        val actual = executeQuery("advanced/second_highest_salary_query.sql")

        val expected = listOf(
            mapOf("secondhighestsalary" to 200)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}