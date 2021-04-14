name := "sbt-getting-started"

version := "0.1"

scalaVersion := "2.13.5"

lazy val calculators = project
  .settings(
    libraryDependencies += ("org.scalatest" %% "scalatest" % "3.0.5" % Test)
  )

lazy val api = project
  .settings(
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "requests" % "0.6.7",
      "org.scala-lang.modules" %% "scala-xml" % "1.3.0",
      "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    )
  )