package T5

import scala.io.StdIn

object sixth {

  def cal_fib_seq(x:Int): Unit = {
    if(x <= 0){
      return
    }else {
      def Fibonacci(n: Int): Int = {
        if (n <= 1) {
          return n
        } else {
          return (Fibonacci(n - 1) + Fibonacci(n - 2));
        }
      }
      print(Fibonacci(x-1)+" ");
      cal_fib_seq(x-1);
    }
  }


  def main(args: Array[String]): Unit = {
    print("Enter Value: ");
    val x = StdIn.readLine().toInt;
    cal_fib_seq(x);
  }
}
