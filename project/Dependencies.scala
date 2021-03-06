import sbt._
import sbt.Keys._

object Dependencies {
  val mill = Def.setting {
    val version = if (scalaBinaryVersion.value == "2.12") "0.6.3" else "0.8.0"
    "com.lihaoyi" %% "mill-scalalib" % version
  }
  val attoCore = "org.tpolecat" %% "atto-core" % "0.8.0"
  val betterFiles = "com.github.pathikrit" %% "better-files" % "3.9.1"
  val betterMonadicFor = "com.olegpy" %% "better-monadic-for" % "0.3.1"
  val caseApp = "com.github.alexarchambault" %% "case-app" % "2.0.3"
  val catsEffect = "org.typelevel" %% "cats-effect" % "2.1.4"
  val catsLaws = "org.typelevel" %% "cats-laws" % "2.1.1"
  val circeConfig = "io.circe" %% "circe-config" % "0.8.0"
  val circeGeneric = "io.circe" %% "circe-generic" % "0.13.0"
  val circeGenericExtras = "io.circe" %% "circe-generic-extras" % "0.13.0"
  val circeLiteral = "io.circe" %% "circe-literal" % circeGeneric.revision
  val circeParser = "io.circe" %% "circe-parser" % circeGeneric.revision
  val circeRefined = "io.circe" %% "circe-refined" % circeGeneric.revision
  val commonsIo = "commons-io" % "commons-io" % "2.7"
  val coursierCore = "io.get-coursier" %% "coursier" % "2.0.0-RC6-23"
  val coursierCatsInterop = "io.get-coursier" %% "coursier-cats-interop" % coursierCore.revision
  val cron4sCore = "com.github.alonsodomin.cron4s" %% "cron4s-core" % "0.6.0"
  val disciplineScalatest = "org.typelevel" %% "discipline-scalatest" % "2.0.0"
  val fs2Core = "co.fs2" %% "fs2-core" % "2.4.2"
  val http4sAsyncHttpClient = "org.http4s" %% "http4s-async-http-client" % "0.21.6"
  val http4sCirce = "org.http4s" %% "http4s-circe" % http4sAsyncHttpClient.revision
  val http4sDsl = "org.http4s" %% "http4s-dsl" % http4sAsyncHttpClient.revision
  val kindProjector = "org.typelevel" % "kind-projector" % "0.11.0"
  val log4catsSlf4j = "io.chrisdavenport" %% "log4cats-slf4j" % "1.1.1"
  val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.2.3"
  val monocleCore = "com.github.julien-truffaut" %% "monocle-core" % "2.0.5"
  val refined = "eu.timepit" %% "refined" % "0.9.15"
  val refinedCats = "eu.timepit" %% "refined-cats" % refined.revision
  val refinedScalacheck = "eu.timepit" %% "refined-scalacheck" % refined.revision
  val scalacacheCaffeine = "com.github.cb372" %% "scalacache-caffeine" % "0.28.0"
  val scalacacheCatsEffect =
    "com.github.cb372" %% "scalacache-cats-effect" % scalacacheCaffeine.revision
  val scalacheck = "org.scalacheck" %% "scalacheck" % "1.14.3"
  val scalaTest = "org.scalatest" %% "scalatest" % "3.2.0"
}
