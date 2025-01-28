package solutions.leetcode.select

import SQLTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ArticleViewsI : SQLTest() {

    @Test
    fun `find self viewed`() {
        setup("select/article_views_i_setup.sql")

        val actual = executeQuery("select/article_views_i_query.sql")

        val expected = listOf(
            mapOf("id" to 4),
            mapOf("id" to 7),
        )

        Assertions.assertEquals(expected, actual)
    }
}