package solutions.leetcode.easy

import SQLTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import ru.asipes.utils.DatabaseUtils.executeQuery
import ru.asipes.utils.DatabaseUtils.executeSqlFile

class ArticleViewsI : SQLTest() {

    @Test
    fun `find self viewed`() {
        executeSqlFile(connection, "sql/article_views_i_setup.sql")

        val actual = executeQuery(connection, "sql/article_views_i_query.sql")

        val expected = listOf(
            mapOf("id" to 4),
            mapOf("id" to 7),
        )

        Assertions.assertEquals(expected, actual)
    }
}