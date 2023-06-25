package T3
import scala.io.StdIn

object secondq {

  def findString(str_list : List[String]): List[String] = {

    var l : List[String] = List()

    for(element <- str_list){
      if(element.length > 5){
        l = element :: l
      }
    }

    return l;

  }

  def main(args: Array[String]): Unit = {

    println("Enter list, separated by spaces: ")
    val input = StdIn.readLine()

    val list: List[String] = input.split(" ").toList

    //println(findString(List("damitha","sahan","Kalani","University","SLIIT")))

    println(findString(list))

  }


}
