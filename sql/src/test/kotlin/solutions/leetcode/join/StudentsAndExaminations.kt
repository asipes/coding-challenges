package solutions.leetcode.join

import SQLTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StudentsAndExaminations : SQLTest() {

    @Test
    fun run() {
        setup("join/students_and_examinations_setup.sql")
        val actual = executeQuery("join/students_and_examinations_query.sql")

        val expected = listOf(
            mapOf("student_id" to 1, "student_name" to "Alice", "subject_name" to "Math", "attended_exams" to 3L),
            mapOf("student_id" to 1, "student_name" to "Alice", "subject_name" to "Physics", "attended_exams" to 2L),
            mapOf("student_id" to 1, "student_name" to "Alice", "subject_name" to "Programming", "attended_exams" to 1L),
            mapOf("student_id" to 2, "student_name" to "Bob", "subject_name" to "Math", "attended_exams" to 1L),
            mapOf("student_id" to 2, "student_name" to "Bob", "subject_name" to "Physics", "attended_exams" to 0L),
            mapOf("student_id" to 2, "student_name" to "Bob", "subject_name" to "Programming", "attended_exams" to 1L),
            mapOf("student_id" to 6, "student_name" to "Alex", "subject_name" to "Math", "attended_exams" to 0L),
            mapOf("student_id" to 6, "student_name" to "Alex", "subject_name" to "Physics", "attended_exams" to 0L),
            mapOf("student_id" to 6, "student_name" to "Alex", "subject_name" to "Programming", "attended_exams" to 0L),
            mapOf("student_id" to 13, "student_name" to "John", "subject_name" to "Math", "attended_exams" to 1L),
            mapOf("student_id" to 13, "student_name" to "John", "subject_name" to "Physics", "attended_exams" to 1L),
            mapOf("student_id" to 13, "student_name" to "John", "subject_name" to "Programming", "attended_exams" to 1L)
        )

        assertEquals(expected, actual)
    }
}