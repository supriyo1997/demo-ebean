name := """demo-ebean"""
organization := "com.demo-ebean"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies += "com.h2database" % "h2" % "1.4.192"



playEbeanModels in Compile := Seq("models.*")
playEbeanDebugLevel := 4

libraryDependencies += guice

libraryDependencies += jdbc
libraryDependencies += javaJdbc
//libraryDependencies += cache
libraryDependencies += javaWs
