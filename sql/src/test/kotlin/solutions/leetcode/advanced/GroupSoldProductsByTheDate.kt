package solutions.leetcode.advanced

import SQLTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.sql.Date

class GroupSoldProductsByTheDate : SQLTest() {

    @Test
    fun run() {
        setup("advanced/group_sold_products_by_the_date_setup.sql")
        val actual = executeQuery("advanced/group_sold_products_by_the_date_query.sql")

        val expected = listOf(
            mapOf(
                "sell_date" to Date.valueOf("2020-05-30"),
                "num_sold" to 3L,
                "products" to "Basketball,Headphone,T-Shirt"
            ),
            mapOf("sell_date" to Date.valueOf("2020-06-01"), "num_sold" to 2L, "products" to "Bible,Pencil"),
            mapOf("sell_date" to Date.valueOf("2020-06-02"), "num_sold" to 1L, "products" to "Mask")
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}