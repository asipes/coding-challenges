import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class ImmediateFoodDeliveryII : SQLTest() {

    @Test
    fun run() {
        setup("aggregate/immediate_food_delivery_ii_setup.sql")
        val actual = executeQuery("aggregate/immediate_food_delivery_ii_query.sql")
        val expected = listOf(
            mapOf("immediate_percentage" to BigDecimal("50.00"))
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}