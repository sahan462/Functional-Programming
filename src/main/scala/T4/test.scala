package T4

object test {
  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  // Test inputs
  val names = List("Benny", "Niroshan", "Saman", "Kumara")

  // Format names using toUpper and toLower methods
  val upperCaseNames = names.map(formatNames(_)(toUpper))
  val lowerCaseNames = names.map(formatNames(_)(toLower))

  // Output
  upperCaseNames.foreach(println)
  lowerCaseNames.foreach(println)

}
