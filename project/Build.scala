
object ApplicationBuild extends Build {

  val appName = "contextviewer"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "junit" % "junit" % "4.11",
    "com.google.code.gson" % "gson" % "2.2.3"
  )

  val main = play.Project(appName, appVersion, appDependencies)
    .settings(
    // Add your own project settings here
  )

}
