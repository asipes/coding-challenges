import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NumberOfUniqueSubjectsTaughtByEachTeacher : SQLTest() {

    @Test
    fun run() {
        setup("sorting/number_of_unique_subjects_taught_by_each_teacher_setup.sql")
        val actual = executeQuery("sorting/number_of_unique_subjects_taught_by_each_teacher_query.sql")

        val expected = listOf(
            mapOf<String, Number>("teacher_id" to 1, "cnt" to 2L),
            mapOf<String, Number>("teacher_id" to 2, "cnt" to 4L),
        )

        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}