package T8
import io.StdIn
object secondq {

  val check = (x: Int) => x % 2 match {
    case 0 => "EVEN";
    case 1 => "ODD";
    case _ => "Error";
  }


  def main(args: Array[String]): Unit = {

    print("Enter Value: ");
    val x = StdIn.readLine();

    println(check(x.toInt));

  }

}
