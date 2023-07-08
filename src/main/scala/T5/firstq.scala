package T5
import scala.io.StdIn

object firstq {

  def findPrime(x:Int, y:Int): String = {
    if(y==1){
      return "true";
    }else{
      if(x%y == 0){
        return "false"
      }else{
        findPrime(x,y-1);
      }
    }
  }


  def main(args: Array[String]): Unit = {
    print("Enter Value: ");
    val x = StdIn.readLine().toInt;
    println(findPrime(x,(x-1)));
  }

}
