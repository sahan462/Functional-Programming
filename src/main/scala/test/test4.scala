package test

object test4 {

  def main(args: Array[String]): Unit = {
    val myMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

    val myMap1 = Map("one" -> 3, "two" -> 2, "three" -> 4)
    val myMap2 = Map("one" -> 2, "two" -> 2, "three" -> 3)
    println(myMap2 ++ myMap1);

    val iterator = myMap.iterator

    while (iterator.hasNext) {
      val (key, value) = iterator.next()
      println(s"Key: $key, Value: $value")
    }


  }

}
