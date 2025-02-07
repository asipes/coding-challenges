package solutions.leetcode.subqueries

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DepartmentTopThreeSalaries : SQLTest() {

    @Test
    fun run() {
        setup("subqueries/department_top_three_salaries_setup.sql")
        val actual = executeQuery("subqueries/department_top_three_salaries_query.sql")

        val expected = listOf(
            mapOf("department" to "IT", "employee" to "Max", "salary" to 90000),
            mapOf("department" to "IT", "employee" to "Joe", "salary" to 85000),
            mapOf("department" to "IT", "employee" to "Randy", "salary" to 85000),
            mapOf("department" to "IT", "employee" to "Will", "salary" to 70000),
            mapOf("department" to "Sales", "employee" to "Henry", "salary" to 80000),
            mapOf("department" to "Sales", "employee" to "Sam", "salary" to 60000)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}