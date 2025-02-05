package solutions.leetcode.select.advanced

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class CountSalaryCategories : SQLTest() {

    @Test
    fun run() {
        setup("select/advanced/count_salary_categories_setup.sql")
        val actual = executeQuery("select/advanced/count_salary_categories_query.sql")

        val expected = listOf(
            mapOf("category" to "Low Salary", "accounts_count" to 1L),
            mapOf("category" to "Average Salary", "accounts_count" to 0L),
            mapOf("category" to "High Salary", "accounts_count" to 3L)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}
