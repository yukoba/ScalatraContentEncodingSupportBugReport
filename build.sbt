ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.6"

// Working
//val ScalatraVersion = "3.1.1"
//val JettyVersion = "12.0.16"

// Not working
val ScalatraVersion = "3.1.2"
val JettyVersion = "12.0.20"

lazy val root = (project in file("."))
  .settings(
    name := "ScalatraContentEncodingSupportBugReport",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra-jakarta" % ScalatraVersion,
      "org.scalatra" %% "scalatra-auth-jakarta" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest-jakarta" % ScalatraVersion % "test",
      "org.eclipse.jetty.ee10" % "jetty-ee10-webapp" % JettyVersion % "container;compile",
      "jakarta.servlet" % "jakarta.servlet-api" % "6.0.0" % "provided",
    ),
  )
