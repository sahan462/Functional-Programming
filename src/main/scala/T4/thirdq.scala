package T4

import scala.io.StdIn

object thirdq {

  def toUpper(str : String): String = {
    return str.toUpperCase();
  }

  def toLower(str: String): String = {
    return str.toLowerCase();
  }

  def formatNames(name:String,Function : (String)=>String): String = {
    return (Function(name));
  }

  def main(args: Array[String]): Unit = {

    var names = List("Benny", "Niroshan", "Saman", "Kumara");
    println(formatNames(names(0),toUpper));
    println(formatNames(names(1).slice(0,2),toUpper) + names(1).slice(2,names(1).length));
    println(formatNames(names(2),toLower));
    println(formatNames(names(3).slice(0,1),toUpper) + names(3).slice(1,names(3).length-1) + formatNames(names(3).slice(names(3).length-1,names(3).length),toUpper));
  }

}
