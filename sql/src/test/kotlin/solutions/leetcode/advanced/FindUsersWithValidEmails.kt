package solutions.leetcode.advanced

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class FindUsersWithValidEmails : SQLTest() {

    @Test
    fun run() {
        setup("advanced/find_users_with_valid_emails_setup.sql")
        val actual = executeQuery("advanced/find_users_with_valid_emails_query.sql")

        val expected = listOf(
            mapOf("user_id" to 1, "name" to "Winston", "mail" to "winston@leetcode.com"),
            mapOf("user_id" to 3, "name" to "Annabelle", "mail" to "bella=@leetcode.com"),
            mapOf("user_id" to 4, "name" to "Sally", "mail" to "sally.com@leetcode.com")
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}