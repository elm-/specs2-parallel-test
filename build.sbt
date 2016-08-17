name := "specs2-parallel-test"

organization := "org.elmarweber.test"

version := "1.0"

scalaVersion := "2.11.7"

testOptions in Test += Tests.Argument("threadsNb", "1")

concurrentRestrictions in Test := Seq(
  Tags.limit(Tags.Test, 1)
)


libraryDependencies += "org.specs2" %% "specs2-core" % "3.8.4" % "test"

