package solutions.leetcode.join

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ProductSalesAnalysisI : SQLTest() {

    @Test
    fun test() {
        setup("join/product_sales_analysis_i_setup.sql")

        val actual = executeQuery("join/product_sales_analysis_i_query.sql")

        val expected = listOf(
            mapOf("product_name" to "Nokia", "year" to 2008, "price" to 5000),
            mapOf("product_name" to "Nokia", "year" to 2009, "price" to 5000),
            mapOf("product_name" to "Apple", "year" to 2011, "price" to 9000),
        )

        assertEquals(expected, actual)
    }
}