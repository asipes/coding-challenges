import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FindFollowersCount : SQLTest() {

    @Test
    fun run() {
        setup("sorting/find_followers_count_setup.sql")
        val actual = executeQuery("sorting/find_followers_count_query.sql")

        val expected = listOf(
            mapOf<String, Number>("user_id" to 0, "followers_count" to 1L),
            mapOf<String, Number>("user_id" to 1, "followers_count" to 1L),
            mapOf<String, Number>("user_id" to 2, "followers_count" to 2L),
        )

        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}