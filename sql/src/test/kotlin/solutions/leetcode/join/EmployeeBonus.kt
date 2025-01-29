package solutions.leetcode.join

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EmployeeBonus : SQLTest() {

    @Test
    fun run() {
        setup("join/employee_bonus_setup.sql")
        val actual = executeQuery("join/employee_bonus_query.sql")

        val expected = listOf(
            mapOf("name" to "Brad", "bonus" to null),
            mapOf("name" to "John", "bonus" to null),
            mapOf("name" to "Dan", "bonus" to 500)
        )

        assertEquals(expected, actual)
    }
}