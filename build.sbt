val scala3Version = "3.4.0"

lazy val root = project
  .in(file("."))
  .settings(
    name:= "scala-3-beginner-project",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
