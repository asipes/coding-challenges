package solutions.leetcode.subqueries

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import java.math.BigDecimal

class FriendRequestsIIWhoHasTheMostFriends : SQLTest() {

    @Test
    fun run() {
        setup("subqueries/friend_requests_ii_who_has_the_most_friends_setup.sql")
        val actual = executeQuery("subqueries/friend_requests_ii_who_has_the_most_friends_query.sql")

        val expected = listOf(
            mapOf("id" to 3, "num" to BigDecimal(3))
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}