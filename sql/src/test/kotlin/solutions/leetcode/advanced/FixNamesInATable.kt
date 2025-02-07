package solutions.leetcode.advanced

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class FixNamesInATable : SQLTest() {

    @Test
    fun run() {
        setup("advanced/fix_names_in_a_table_setup.sql")
        val actual = executeQuery("advanced/fix_names_in_a_table_query.sql")

        val expected = listOf(
            mapOf("user_id" to 1, "name" to "Alice"),
            mapOf("user_id" to 2, "name" to "Bob")
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}