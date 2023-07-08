package T5
import scala.io.StdIn

object fourthq {

  def check_even_odd(n: Int): String = {
    if(n == 0){
      return "Even"
    }else if(n < 0){
      return "ODD"
    }else{
      check_even_odd(n-2)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter Value: ");
    val x = StdIn.readLine().toInt;
    println(check_even_odd(x));
  }

}
