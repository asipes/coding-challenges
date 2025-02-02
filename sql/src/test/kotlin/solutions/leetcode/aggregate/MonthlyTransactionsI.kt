import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MonthlyTransactionsI : SQLTest() {

    @Test
    fun run() {
        setup("aggregate/monthly_transactions_i_setup.sql")
        val actual = executeQuery("aggregate/monthly_transactions_i_query.sql")
        val expected = listOf(
            mapOf("month" to "2018-12", "country" to "US", "trans_count" to 2L, "approved_count" to 1L, "trans_total_amount" to 3000L, "approved_total_amount" to 1000L),
            mapOf("month" to "2019-01", "country" to "US", "trans_count" to 1L, "approved_count" to 1L, "trans_total_amount" to 2000L, "approved_total_amount" to 2000L),
            mapOf("month" to "2019-01", "country" to "DE", "trans_count" to 1L, "approved_count" to 1L, "trans_total_amount" to 2000L, "approved_total_amount" to 2000L)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}