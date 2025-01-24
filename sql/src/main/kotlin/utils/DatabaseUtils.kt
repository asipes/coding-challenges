package ru.asipes.utils

import java.sql.Connection

object DatabaseUtils {
    /**
     * Выполняет SQL-скрипт из файла.
     * @param connection - подключение к базе данных
     * @param filePath - путь к SQL-файлу (относительно resources)
     */
    fun executeSqlFile(connection: Connection, filePath: String) {
        val sql = this::class.java.classLoader.getResourceAsStream(filePath)
            ?.bufferedReader()
            ?.use { it.readText() }
            ?: throw IllegalArgumentException("File $filePath not found")

        connection.createStatement().use { stmt ->
            stmt.execute(sql)
        }
    }

    /**
     * Выполняет SQL-запрос и возвращает результат в виде списка строк.
     * @param connection - подключение к базе данных
     * @param filePath - путь к SQL-файлу (относительно resources)
     * @return список строк, где каждая строка представлена как Map (имя колонки -> значение)
     */
    fun executeQuery(connection: Connection, filePath: String): List<Map<String, Any>> {
        val sql = this::class.java.classLoader.getResourceAsStream(filePath)
            ?.bufferedReader()
            ?.use { it.readText() }
            ?: throw IllegalArgumentException("File $filePath not found")

        val results = mutableListOf<Map<String, Any>>()

        connection.createStatement().use { stmt ->
            stmt.executeQuery(sql).use { rs ->
                val metaData = rs.metaData
                val columnCount = metaData.columnCount

                while (rs.next()) {
                    val row = mutableMapOf<String, Any>()
                    for (i in 1..columnCount) {
                        row[metaData.getColumnName(i)] = rs.getObject(i)
                    }
                    results.add(row)
                }
            }
        }

        return results
    }
}