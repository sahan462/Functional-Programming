package T5

import scala.io.StdIn

object fifthq {

  def get_even_sum(n: Int): Int = {

    if(n == 0){
      return n
    }else{
      if(n%2 == 0){
        return n + get_even_sum(n-1)
      }else{
        get_even_sum(n-1);
      }
    }
  }


  def main(args: Array[String]): Unit = {
    print("Enter Value: ");
    val x = StdIn.readLine().toInt;
    println(get_even_sum(x));
  }




}
