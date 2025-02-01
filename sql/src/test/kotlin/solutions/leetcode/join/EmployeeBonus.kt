package solutions.leetcode.join

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EmployeeBonus : SQLTest() {

    @Test
    fun run() {
        setup("join/employee_bonus_setup.sql")
        val actual: List<Map<String, Any?>> = executeQuery("join/employee_bonus_query.sql")

        val expected: List<Map<String, Any?>> = listOf(
            mapOf("name" to "Brad", "bonus" to null),
            mapOf("name" to "John", "bonus" to null),
            mapOf("name" to "Dan", "bonus" to 500)
        )

        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}