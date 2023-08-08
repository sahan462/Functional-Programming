package T7

object thirdq {

  //used to check if a given number is prime or not
  val isPrime = (num:Int) => {
    if (num <= 1) false
    else {
      var result = true
      var i = num - 1

      while (i > 1) {
        if(num % i == 0) {
          result = false
          i = 0
        } else {
          i = i - 1
        }
      }

      result
    }
  }

  //filter prime function
  def filterPrime(function: Int => Boolean, l: List[Int]): Unit = {
    println("List with only prime numbers: " + l.filter(function))
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    filterPrime(isPrime, list)
  }
}
