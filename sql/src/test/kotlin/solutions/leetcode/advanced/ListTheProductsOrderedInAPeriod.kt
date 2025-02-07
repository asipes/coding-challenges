package solutions.leetcode.advanced

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class ListTheProductsOrderedInAPeriod : SQLTest() {

    @Test
    fun run() {
        setup("advanced/list_the_products_ordered_in_a_period_setup.sql")
        val actual = executeQuery("advanced/list_the_products_ordered_in_a_period_query.sql")

        val expected = listOf(
            mapOf("product_name" to "Leetcode Solutions", "unit" to 130),
            mapOf("product_name" to "Leetcode Kit", "unit" to 100)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}