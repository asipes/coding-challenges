package solutions.leetcode.join.advanced

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class TheNumberOfEmployeesWhichReportToEachEmployee : SQLTest() {

    @Test
    fun run() {
        setup("join/advanced/the_number_of_employees_which_report_to_each_employee_setup.sql")
        val actual = executeQuery("join/advanced/the_number_of_employees_which_report_to_each_employee_query.sql")

        val expected = listOf(
            mapOf("employee_id" to 1, "name" to "Michael", "reports_count" to 2, "average_age" to 40),
            mapOf("employee_id" to 2, "name" to "Alice", "reports_count" to 2, "average_age" to 37),
            mapOf("employee_id" to 3, "name" to "Bob", "reports_count" to 1, "average_age" to 37)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}