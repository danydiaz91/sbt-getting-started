name := "sbt-getting-started"

version := "0.1"

scalaVersion := "2.13.5"

lazy val calculators = project
  .dependsOn(api)
  .settings(
    libraryDependencies ++= Dependencies.calculatorDependencies
  )

lazy val api = project
  .settings(
    libraryDependencies ++= Dependencies.apiDependencies
  )