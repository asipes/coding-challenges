package solutions.leetcode

import SQLTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.testcontainers.junit.jupiter.Testcontainers
import ru.asipes.utils.DatabaseUtils.executeQuery
import ru.asipes.utils.DatabaseUtils.executeSqlFile

@Testcontainers
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BigCountries : SQLTest() {

    @Test
    fun `find big countries`() {
        executeSqlFile(connection, "sql/big_countries_setup.sql")

        val actual = executeQuery(connection, "sql/select/big_countries_query.sql")

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