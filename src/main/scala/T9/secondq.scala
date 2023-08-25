package T9

class Rational_Q2 {
 private var numerator: Int = 0
 private var denominator: Int = 1

 def this(numerator: Int, denominator: Int) = {
  this()
  try {
   require(denominator != 0, "Denominator cannot be zero")
   this.numerator = numerator
   this.denominator = denominator
  } catch {
   case e: IllegalArgumentException =>
    println(e.getMessage)
  }
 }

 def neg: Rational_Q2 = {
  val neg_ob = new Rational_Q2(-this.numerator, this.denominator)
  println(neg_ob.numerator + "/" + neg_ob.denominator)
  neg_ob
 }

 def -(that: Rational_Q2): Rational_Q2 = {
  val commonDenominator = this.denominator * that.denominator
  val newNumerator = (this.numerator * that.denominator) - (that.numerator * this.denominator)
  new Rational_Q2(newNumerator, commonDenominator)
 }

 def getNumerator(): String = {
  return this.numerator.toString
 }

 def getDenominator(): String = {
  return this.denominator.toString
 }

}

object secondq {
 def main(args: Array[String]): Unit = {
  val x = new Rational_Q2(3, 4)
  val y = new Rational_Q2(5, 8)
  val z = new Rational_Q2(2, 7)

  val result = x - y - z
  println(result.getNumerator() + "/" + result.getDenominator())
 }
}
