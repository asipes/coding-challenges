package solutions.leetcode.join

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomerWhoVisitedButDidNotMakeAnyTransactions : SQLTest() {

    @Test
    fun test() {
        setup("join/customer_who_visited_but_did_not_make_any_transactions_setup.sql")
        val actual = executeQuery("join/customer_who_visited_but_did_not_make_any_transactions_query.sql")

        val expected = listOf(
            mapOf<String, Number>("customer_id" to 30, "count_no_trans" to 1L),
            mapOf<String, Number>("customer_id" to 54, "count_no_trans" to 2L),
            mapOf<String, Number>("customer_id" to 96, "count_no_trans" to 1L)
        )

        assertThat(actual).containsExactlyElementsOf(expected)
    }
}