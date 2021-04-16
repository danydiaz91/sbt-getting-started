import sbt._

object Dependencies {

  val scalaRequests = "com.lihaoyi" %% "requests" % "0.6.7"
  val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.3.0"
  val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"

  val commonDependencies: Seq[ModuleID] = Seq(scalaTest % Test)
  val apiDependencies: Seq[ModuleID] = Seq(scalaRequests, scalaXml) ++ commonDependencies

  val calculatorDependencies: Seq[ModuleID] = commonDependencies
}
