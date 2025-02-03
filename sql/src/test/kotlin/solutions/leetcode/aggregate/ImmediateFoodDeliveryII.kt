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

/*
SELECT ROUND(
                       COUNT(*) FILTER (WHERE order_date = customer_pref_delivery_date AND rank = 1) * 100.0 /
                       COUNT(*) FILTER (WHERE rank = 1), 2) AS immediate_percentage
FROM (SELECT *,
             RANK() OVER (PARTITION BY customer_id ORDER BY order_date) AS rank
      FROM delivery) AS first_orders

 */

/*
 SELECT ROUND(COUNT(*) FILTER (WHERE order_date = customer_pref_delivery_date) * 100.0 / COUNT(*), 2)::numeric(10,2) AS immediate_percentage
FROM (SELECT DISTINCT ON (order_date) order_date,
                                      customer_pref_delivery_date
      FROM delivery
      GROUP BY order_date, customer_pref_delivery_date) AS first_orders;
 */
