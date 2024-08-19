object NameFormatter {


  def toUpper(name: String): String = name.toUpperCase()


  def toLower(name: String): String = name.toLowerCase()


  def formatNames(name: String, formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {

    val benny = formatNames("Benny", toUpper)
    val niroshan = formatNames("Niroshan", name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase)
    val saman = formatNames("Saman", toLower)
    val kumara = formatNames("Kumara", name => name.substring(0, 1).toUpperCase + name.substring(1, 5).toLowerCase + name.substring(5).toUpperCase)


    println(benny)
    println(niroshan)
    println(saman)
    println(kumara)    
  }
}
