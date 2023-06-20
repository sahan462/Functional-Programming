package T2

object secondq {

  def main(args: Array[String]): Unit = {

    var a : Int = 2
    var b : Int = 3
    var c : Int = 4
    var d : Int = 5
    var k  = 4.3f
    var g : Double = 4.0f

    b = b - 1
    println(b * a + c * d)
    d = d - 1


    println(a)
    a = a + 1

    println(-2 * (g - k) + c)


    println(c)

    c = c + 1
    println(c*a)
    a = a + 1
  }
}
