package solutions.leetcode.easy

import SQLTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import ru.asipes.utils.DatabaseUtils.executeQuery
import ru.asipes.utils.DatabaseUtils.executeSqlFile

class RecyclableAndLowFatProducts : SQLTest() {

    @Test
    fun `count recyclable and low-fat products`() {
        executeSqlFile(connection,"sql/recyclable_and_low_fat_products_setup.sql")
        executeSqlFile(connection, "sql/recyclable_and_low_fat_products_data.sql")

        val result = executeQuery(connection, "sql/recyclable_and_low_fat_products_query.sql")

        val expected = listOf(
            mapOf("product_id" to 1),
            mapOf("product_id" to 3),
        )

        Assertions.assertEquals(expected, result)
    }
}