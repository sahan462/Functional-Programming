package T5
import scala.io.StdIn

object thirdq {

  def sum(n: Int): Int = {
    if(n<=0){
      return n
    }else{
      return n + sum(n-1)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter Value: ");
    val x = StdIn.readLine().toInt;
    println(sum(x));
  }

}
