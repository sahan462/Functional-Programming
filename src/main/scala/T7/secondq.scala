package T7

object secondq {

  val squareNumbers = (list: List[Int]) => list.map(num => math.pow(num,2).toInt);

  def calculateSquare(function: (List[Int]) => List[Int], l: List[Int]): Unit = {
    println("List with square values: " + function(l));
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5);
    calculateSquare(squareNumbers, list);
  }
}
