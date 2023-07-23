package T5
import scala.io.StdIn

object secondq {

  def primeSeq(n: Int): Unit = {
    if(n==1){
      return
    }else{
      def Prime(x: Int, y: Int): String = {
        if(x == 1){
          return "false"
        }else if (y == 1) {
          return "true";
        } else {
          if (x % y == 0) {
            return "false"
          } else {
            Prime(x, y - 1);
          }
        }
      }
      if (Prime(n,n-1)== "true"){
        println(n)
        primeSeq(n-1);
      }else{
        primeSeq(n-1)
      }
    }
  }



  def main(args: Array[String]): Unit = {
    print("Enter Value: ");
    val x = StdIn.readLine().toInt;
    primeSeq(x);
  }
}
