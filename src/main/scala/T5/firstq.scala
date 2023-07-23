package T5
import scala.io.StdIn

object firstq {

  def Prime(x:Int, y:Int): String = {
    if(x == 1){
      return "false"
    }else if(y==1){
      return "true";
    }else{
      if(x%y == 0){
        return "false"
      }else{
        Prime(x,y-1);
      }
    }
  }


  def main(args: Array[String]): Unit = {
    print("Enter Value: ");
    val x = StdIn.readLine().toInt;
    println(Prime(x,(x-1)));
  }

}
