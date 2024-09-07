import Dependencies._

ThisBuild / scalaVersion     := "2.13.12"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.nkrumahsarpong"
ThisBuild / organizationName := "nkrumahsarpong"

lazy val root = (project in file("."))
  .settings(
    name := "Scurvey Backend",
    libraryDependencies += munit % Test
  )

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.19",
  "dev.zio" %% "zio-streams" % "2.0.19",
  "dev.zio" %% "zio-test" % "2.0.19" % Test,
  "dev.zio" %% "zio-test-sbt" % "2.0.19" % Test
)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
