import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BiggestSingleNumber : SQLTest() {

    @Test
    fun run() {
        setup("sorting/biggest_single_number_setup.sql")
        val actual = executeQuery("sorting/biggest_single_number_query.sql")

        val expected = listOf(
            mapOf("num" to 6)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}