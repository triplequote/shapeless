resolvers += Resolver.url("Hydra Artifactory", url("https://repo.triplequote.com/artifactory/sbt-plugins-staging/"))(Resolver.ivyStylePatterns)
addSbtPlugin("com.triplequote" % "sbt-hydra" % "2.3.0-a04")
