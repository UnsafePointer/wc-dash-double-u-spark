/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.unsafepointer.word_count

import org.apache.spark.SparkFiles
import org.apache.spark.sql.SparkSession
import org.jetbrains.kotlinx.spark.api.sparkContext
import java.net.URI

fun main() {
    val bookUrl = URI("https://www.gutenberg.org/files/2600/2600-0.txt")
    val fileName = bookUrl.path.split("/").last()
    val sparkSession = SparkSession.builder().master("local[2]").appName("SparkParquetExample").orCreate
    sparkSession.sparkContext.addFile(bookUrl.toString())
    val sparkFile = SparkFiles.get(fileName)
    val dataSet = sparkSession.read().text("file://$sparkFile")
    dataSet.show()
    sparkSession.stop()
}
