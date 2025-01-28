package solutions.leetcode.select

import SQLTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindCustomerReferee : SQLTest() {

    @Test
    fun `find customer referee`() {
        setup("select/find_customer_referee_setup.sql")

        val actual = executeQuery("select/find_customer_referee_query.sql")
        val expected = listOf(
            mapOf("name" to "Will"),
            mapOf("name" to "Jane"),
            mapOf("name" to "Bill"),
            mapOf("name" to "Zack"),
        )

        Assertions.assertEquals(expected, actual)
    }
}