import sbt._ 

class Project(info: ProjectInfo) extends DefaultProject(info) { 
  val scalatest = "org.scalatest" % "scalatest" % "1.2"
  val borachio = 
    "com.borachio" %% "borachio" % "latest.integration"
}
