import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CustomersWhoBoughtAllProducts : SQLTest() {

    @Test
    fun run() {
        setup("sorting/customers_who_bought_all_products_setup.sql")
        val actual = executeQuery("sorting/customers_who_bought_all_products_query.sql")

        val expected = listOf(
            mapOf("customer_id" to 1),
            mapOf("customer_id" to 3),
        )

        assertThat(actual)
            .containsExactlyInAnyOrderElementsOf(expected)
    }
}