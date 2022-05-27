package org.example
import org.apache.spark.SparkConf

import org.apache.spark.sql.{SparkSession, functions}

object App {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("SCDMA: Compact Parquet Files")
    val spark = SparkSession.builder().config(conf).enableHiveSupport().getOrCreate()
    val sc = spark.sparkContext

    // Lectura de tabla
    val df = spark.read.csv("...")



    println("df format ahora")
  }
}
