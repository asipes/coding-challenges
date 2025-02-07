package solutions.leetcode.subqueries

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class DepartmentTopThreeSalaries : SQLTest() {

    @Test
    fun run() {
        setup("subqueries/department_top_three_salaries_setup.sql")
        val actual = executeQuery("subqueries/department_top_three_salaries_query.sql")

        val expected = listOf(
            mapOf("Department" to "IT", "Employee" to "Max", "Salary" to 90000),
            mapOf("Department" to "IT", "Employee" to "Joe", "Salary" to 85000),
            mapOf("Department" to "IT", "Employee" to "Randy", "Salary" to 85000),
            mapOf("Department" to "IT", "Employee" to "Will", "Salary" to 70000),
            mapOf("Department" to "Sales", "Employee" to "Henry", "Salary" to 80000),
            mapOf("Department" to "Sales", "Employee" to "Sam", "Salary" to 60000)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}