package T3
import scala.io.StdIn


object firstq {

  def reverseString(T : String, L : Int, E : String): String = {
      if(L <= 0){
        return E;
      }else{
        var rev_str = E + T.last
        var len = L - 1
        var str = T.slice(0,len)
        reverseString(str,len,rev_str)
      }
  }

  def main(args: Array[String]): Unit = {

    var empty_string = "";

    println("Please enter your name: ")
    val string = StdIn.readLine()

    println(reverseString(string,string.length,empty_string))
  }

}
