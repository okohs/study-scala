resolvers += Resolver.typesafeIvyRepo("releases")

scalaVersion := "2.11.8"

libraryDependencies += "com.typesafe" %% "emoji" % "1.0.0"

initialCommands in console += {
  Iterator(
    "com.typesafe.emoji._",
    "com.typesafe.emoji.Emoji.Implicits._"
  ).map("import "+).mkString("\n")
}
