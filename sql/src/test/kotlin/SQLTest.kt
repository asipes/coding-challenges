import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import ru.asipes.utils.DatabaseUtils.executeQuery
import ru.asipes.utils.DatabaseUtils.executeSqlFile
import java.sql.Connection
import java.sql.DriverManager

@Testcontainers
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class SQLTest {
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

    protected fun setup(path: String) {
        executeSqlFile(connection, path)
    }

    protected fun executeQuery(path: String) : List<Map<String, Any>> {
        return executeQuery(connection, path)
    }
}