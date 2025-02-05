package solutions.leetcode.select.advanced

import SQLTest
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class ProductPriceAtAGivenDate : SQLTest() {

    @Test
    fun run() {
        setup("select/advanced/product_price_at_a_given_date_setup.sql")
        val actual = executeQuery("select/advanced/product_price_at_a_given_date_query.sql")

        val expected = listOf(
            mapOf("product_id" to 2, "price" to 50),
            mapOf("product_id" to 1, "price" to 35),
            mapOf("product_id" to 3, "price" to 10)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}