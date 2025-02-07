package solutions.leetcode.advanced

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class PatientsWithACondition : SQLTest() {

    @Test
    fun run() {
        setup("advanced/patients_with_a_condition_setup.sql")
        val actual = executeQuery("advanced/patients_with_a_condition_query.sql")

        val expected = listOf(
            mapOf("patient_id" to 3, "patient_name" to "Bob", "conditions" to "DIAB100 MYOP"),
            mapOf("patient_id" to 4, "patient_name" to "George", "conditions" to "ACNE DIAB100")
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}