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
class RecyclableAndLowFatProducts {

    companion object {
        @Container
        private val postgreSQLContainer = PostgreSQLContainer<Nothing>("postgres:15").apply {
            withDatabaseName("test_db")
            withUsername("postgres")
            withPassword("postgres")
        }
    }

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
    fun `count recyclable and low-fat products`() {
        executeSqlFile(connection,"sql/recyclable_and_low_fat_products_setup.sql")
        executeSqlFile(connection, "sql/recyclable_and_low_fat_products_data.sql")

        val result = executeQuery(connection, "sql/recyclable_and_low_fat_products_query.sql")

        val expected = listOf(
            mapOf("product_id" to 1),
            mapOf("product_id" to 3),
        )

        Assertions.assertEquals(expected, result)
    }
}