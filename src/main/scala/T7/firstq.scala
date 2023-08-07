package T7

object firstq {

  val evenNumbers = (list : List[Int]) => list.filter(_ % 2 == 0);

  def filterEvenNumbers(function:(List[Int]) => List[Int],l : List[Int]): Unit = {
    println("List with only Evens: " + function(l));
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    filterEvenNumbers(evenNumbers,list);
  }

}
