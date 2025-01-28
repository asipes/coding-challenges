package solutions.leetcode.select

import SQLTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RecyclableAndLowFatProducts : SQLTest() {

    @Test
    fun `count recyclable and low-fat products`() {
        setup("select/recyclable_and_low_fat_products_setup.sql")

        val result = executeQuery("select/recyclable_and_low_fat_products_query.sql")

        val expected = listOf(
            mapOf("product_id" to 1),
            mapOf("product_id" to 3),
        )

        Assertions.assertEquals(expected, result)
    }
}