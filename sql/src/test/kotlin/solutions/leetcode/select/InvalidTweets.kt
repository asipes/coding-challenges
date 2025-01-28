package solutions.leetcode.select

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InvalidTweets : SQLTest() {

    @Test
    fun `find invalid tweets`() {
        setup("select/invalid_tweets_setup.sql")

        val actual = executeQuery("select/invalid_tweets_query.sql")

        val expected = listOf(
            mapOf("tweet_id" to 2),
        )

        assertEquals(expected, actual)
    }
}