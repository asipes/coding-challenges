package solutions.leetcode.join.advanced

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PrimaryDepartmentForEachEmployee : SQLTest() {

    @Test
    fun run() {
        setup("join/advanced/primary_department_for_each_employee_setup.sql")
        val actual = executeQuery("join/advanced/primary_department_for_each_employee_query.sql")

        val expected = listOf(
            mapOf("employee_id" to 1, "department_id" to 1),
            mapOf("employee_id" to 2, "department_id" to 1),
            mapOf("employee_id" to 3, "department_id" to 3),
            mapOf("employee_id" to 4, "department_id" to 3)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}