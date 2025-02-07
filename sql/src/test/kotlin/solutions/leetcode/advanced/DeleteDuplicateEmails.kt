package solutions.leetcode.advanced

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DeleteDuplicateEmails : SQLTest() {

    @Test
    fun run() {
        setup("advanced/delete_duplicate_emails_setup.sql")
        executeDelete("advanced/delete_duplicate_emails_query.sql")
        val actual = executeQuery("advanced/check_delete_duplicate_emails_query.sql")

        val expected = listOf(
            mapOf("id" to 1, "email" to "john@example.com"),
            mapOf("id" to 2, "email" to "bob@example.com")
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}