package T4

import scala.io.StdIn

object thirdq {

  def toUpper(str : String): String = {
    return str.toUpperCase();
  }

  def toLower(str: String): String = {
    return str.toLowerCase();
  }

  def formatNames(name:String,Function : (String)=>String): Unit = {
    println(Function(name));
  }

  def main(args: Array[String]): Unit = {

    var names = List("Benny", "Niroshan", "Saman", "Kumara");
    formatNames(names(0),toUpper);
    formatNames(names(1),toUpper);
    formatNames(names(2),toLower);
    formatNames(names(3),toUpper);
  }

}
