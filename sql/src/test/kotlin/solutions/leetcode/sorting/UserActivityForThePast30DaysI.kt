import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.sql.Date

class UserActivityForThePast30DaysI : SQLTest() {

    @Test
    fun run() {
        setup("sorting/user_activity_for_the_past_30_days_i_setup.sql")
        val actual = executeQuery("sorting/user_activity_for_the_past_30_days_i_query.sql")

        val expected = listOf(
            mapOf("day" to Date.valueOf("2019-07-20"), "active_users" to 2L),
            mapOf("day" to Date.valueOf("2019-07-21"), "active_users" to 2L)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)

    }
}