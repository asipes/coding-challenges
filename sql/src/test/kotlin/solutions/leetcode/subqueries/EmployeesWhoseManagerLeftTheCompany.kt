package solutions.leetcode.subqueries

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class EmployeesWhoseManagerLeftTheCompany : SQLTest() {

    @Test
    fun run() {
        setup("subqueries/employees_whose_manager_left_the_company_setup.sql")
        val actual = executeQuery("subqueries/employees_whose_manager_left_the_company_query.sql")

        val expected = listOf(
            mapOf("employee_id" to 11),
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}