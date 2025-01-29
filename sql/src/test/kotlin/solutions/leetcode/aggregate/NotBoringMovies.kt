package solutions.leetcode.aggregate

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class NotBoringMovies : SQLTest() {

    @Test
    fun run() {
        setup("aggregate/not_boring_movies_setup.sql")
        val actual = executeQuery("aggregate/not_boring_movies_query.sql")

        val expected = listOf(
            mapOf("id" to 5, "movie" to "House card", "description" to "Interesting", "rating" to BigDecimal("9.1")),
            mapOf("id" to 1, "movie" to "War", "description" to "great 3D", "rating" to BigDecimal("8.9"))
        )

        assertEquals(expected, actual)
    }
}