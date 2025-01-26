package solutions.leetcode.easy

import org.junit.jupiter.api.*
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import ru.asipes.utils.DatabaseUtils.executeQuery
import ru.asipes.utils.DatabaseUtils.executeSqlFile
import java.sql.Connection
import java.sql.DriverManager

@Testcontainers
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindCustomerReferee {
    companion object {
        @Container
        private val postgreSQLContainer = PostgreSQLContainer<Nothing>("postgres:15").apply {
            withDatabaseName("test_db")
            withUsername("postgres")
            withPassword("postgres")
        }
    }

    // docker run --name leetcode-pg -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=leetcode_db -p 5432:5432 -d postgres

    private lateinit var connection: Connection

    @BeforeAll
    fun setupDatabase() {
        connection = DriverManager.getConnection(
            postgreSQLContainer.jdbcUrl,
            postgreSQLContainer.username,
            postgreSQLContainer.password,
        )
    }

    @AfterAll
    fun tearDown() {
        connection.close()
    }

    @Test
    fun `find customer referee`() {
        executeSqlFile(connection, "sql/find_customer_referee_setup.sql")
        executeSqlFile(connection, "sql/find_customer_referee_data.sql")

        val actual = executeQuery(connection, "sql/find_customer_referee_query.sql")
        val expected = listOf(
            mapOf("name" to "Will"),
            mapOf("name" to "Jane"),
            mapOf("name" to "Bill"),
            mapOf("name" to "Zack"),
        )

        Assertions.assertEquals(expected, actual)
    }
}