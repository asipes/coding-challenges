import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ProductSalesAnalysisIII : SQLTest() {

    @Test
    fun run() {
        setup("sorting/product_sales_analysis_iii_setup.sql")
        val actual = executeQuery("sorting/product_sales_analysis_iii_query.sql")
        val expected = listOf(
            mapOf("product_id" to 100, "first_year" to 2008, "quantity" to 10, "price" to 5000),
            mapOf("product_id" to 200, "first_year" to 2011, "quantity" to 15, "price" to 9000)
        )
        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}