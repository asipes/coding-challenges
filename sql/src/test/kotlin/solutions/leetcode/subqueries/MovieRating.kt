package solutions.leetcode.subqueries

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class MovieRating : SQLTest() {

    @Test
    fun run() {
        setup("subqueries/movie_rating_setup.sql")
        val actual = executeQuery("subqueries/movie_rating_query.sql")

        val expected = listOf(
            mapOf("results" to "Daniel"),
            mapOf("results" to "Frozen 2"),
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}