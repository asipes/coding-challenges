import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ClassesMoreThan5Students : SQLTest() {

    @Test
    fun run() {
        setup("sorting/classes_more_than_5_students_setup.sql")
        val actual = executeQuery("sorting/classes_more_than_5_students_query.sql")
        val expected = listOf(
            mapOf("class" to "Math")
        )

        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}