import sbt._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "contextviewer"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "play" %% "play-test" % play.core.PlayVersion.current % "test" exclude("com.novocode", "junit-interface"),
    "com.novocode" % "junit-interface" % "0.9" % "test"
  )

  val main = play.Project(appName, appVersion, appDependencies)
    .settings(
    // Add your own project settings here
  )

}