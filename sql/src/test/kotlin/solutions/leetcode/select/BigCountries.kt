package solutions.leetcode.select

import SQLTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.testcontainers.junit.jupiter.Testcontainers

@Testcontainers
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BigCountries : SQLTest() {

    @Test
    fun `find big countries`() {
        setup("select/big_countries_setup.sql")

        val actual = executeQuery("select/big_countries_query.sql")

        val expected = listOf(
            mapOf(
                "name" to "Afghanistan",
                "population" to 25500100,
                "area" to 652230
            ),
            mapOf(
                "name" to "Algeria",
                "population" to 37100000,
                "area" to 2381741
            )
        )

        Assertions.assertEquals(expected, actual)
    }
}