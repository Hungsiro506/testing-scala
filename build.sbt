name := "testing-scala"

version := "0.1"

val scalaVersion = "2.12.4"
val scalaTestVersion = "3.0.4"

val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion % "test"


libraryDependencies ++= Seq(scalaTest)