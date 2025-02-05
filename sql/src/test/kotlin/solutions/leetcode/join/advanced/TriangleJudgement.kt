package solutions.leetcode.join.advanced

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TriangleJudgement : SQLTest() {

    @Test
    fun run() {
        setup("join/advanced/triangle_judgement_setup.sql")
        val actual = executeQuery("")

        val expected = listOf(
            mapOf("x" to 13, "y" to 15, "z" to 30, "triangle" to "No"),
            mapOf("x" to 10, "y" to 20, "z" to 15, "triangle" to "Yes")
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}