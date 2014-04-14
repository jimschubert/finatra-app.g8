name := "$app_name$"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.3"

resolvers += DefaultMavenRepository

resolvers += Resolver.sonatypeRepo("releases")

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.5.3"
)

