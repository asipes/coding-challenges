package solutions.leetcode.aggregate

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class ProjectEmployeesI : SQLTest() {

    @Test
    fun run() {
        setup("aggregate/project_employees_i_setup.sql")
        val actual = executeQuery("aggregate/project_employees_i_query.sql")

        val expected = listOf(
            mapOf("project_id" to 2, "average_years" to BigDecimal("2.50")),
            mapOf("project_id" to 1, "average_years" to BigDecimal("2.00")),
        )
        assertEquals(expected, actual)
    }
}