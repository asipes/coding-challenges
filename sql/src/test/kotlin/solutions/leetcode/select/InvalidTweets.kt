package solutions.leetcode.select

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import ru.asipes.utils.DatabaseUtils.executeQuery
import ru.asipes.utils.DatabaseUtils.executeSqlFile

class InvalidTweets : SQLTest() {

    @Test
    fun `find invalid tweets`() {
        executeSqlFile(connection, "sql/select/invalid_tweets_setup.sql")

        val actual = executeQuery(connection, "sql/select/invalid_tweets_query.sql")

        val expected = listOf(
            mapOf("tweet_id" to 2),
        )

        assertEquals(expected, actual)
    }
}