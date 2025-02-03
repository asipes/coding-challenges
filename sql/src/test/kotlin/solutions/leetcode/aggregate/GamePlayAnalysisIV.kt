import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class GamePlayAnalysisIV : SQLTest() {

    @Test
    fun run() {
        setup("aggregate/game_play_analysis_iv_setup.sql")
        val actual = executeQuery("aggregate/game_play_analysis_iv_query.sql")

        val expected = listOf(
            mapOf("fraction" to BigDecimal("0.33"))
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}