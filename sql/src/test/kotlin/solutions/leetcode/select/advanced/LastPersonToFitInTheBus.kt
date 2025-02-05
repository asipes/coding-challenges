package solutions.leetcode.select.advanced

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class LastPersonToFitInTheBus : SQLTest() {

    @Test
    fun run() {
        setup("select/advanced/last_person_to_fit_in_the_bus_setup.sql")
        val actual = executeQuery("select/advanced/last_person_to_fit_in_the_bus_query.sql")

        val expected = listOf(
            mapOf("person_name" to "John Cena"),
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}