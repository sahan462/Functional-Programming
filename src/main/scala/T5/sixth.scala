package T5

import scala.io.StdIn

object sixth {

  def cal_fib_seq(x:Int, ls:List[Int]): List[Int] = {
    if(x <= 0){
      return ls.sorted
    }else {
      def Fibonacci(n: Int): Int = {
        if (n <= 1) {
          return n
        } else {
          return (Fibonacci(n - 1) + Fibonacci(n - 2));
        }
      }
      val nl = ls ::: List(Fibonacci(x-1));
      cal_fib_seq(x-1,nl);
    }
  }


  def main(args: Array[String]): Unit = {
    print("Enter Value: ");
    val x = StdIn.readLine().toInt;
    val l : List[Int] = List();
    println(cal_fib_seq(x,l));
  }
}
