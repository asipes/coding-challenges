package solutions.leetcode.join

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class AverageTimeOfProcessPerMachine : SQLTest() {

    @Test
    fun run() {
        setup("join/average_time_of_process_per_machine_setup.sql")
        val actual: List<Map<String, Any>> = executeQuery("join/average_time_of_process_per_machine_query.sql")

        val expected: List<Map<String, Any>> = listOf(
            mapOf("machine_id" to 0, "processing_time" to BigDecimal("0.894")),
            mapOf("machine_id" to 1, "processing_time" to BigDecimal("0.995")),
            mapOf("machine_id" to 2, "processing_time" to BigDecimal("1.456"))
        )

        assertEquals(expected, actual)
    }
}