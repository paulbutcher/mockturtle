name := "Mock Turtle"

version := "2.0"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.6.1" % "test",
  "com.borachio" %% "borachio-scalatest-support" % "latest.integration"
)