package solutions.leetcode.join

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import ru.asipes.utils.DatabaseUtils.executeQuery
import ru.asipes.utils.DatabaseUtils.executeSqlFile

class ReplaceEmployeeIDWithTheUniqueIdentifier : SQLTest() {

    @Test
    fun `select all employees`() {
        executeSqlFile(connection, "join/replace_employee_id_with_the_uniqueIdentifier_setup.sql")

        val actual = executeQuery(connection, "join/replace_employee_id_with_the_uniqueIdentifier_query.sql")

        val expected = listOf(
            mapOf("unique_id" to null, "name" to "Alice"),
            mapOf("unique_id" to 1, "name" to "Jonathan"),
            mapOf("unique_id" to null, "name" to "Bob"),
            mapOf("unique_id" to 2, "name" to "Meir"),
            mapOf("unique_id" to 3, "name" to "Winston"),
        )

        assertEquals(expected, actual)
    }
}