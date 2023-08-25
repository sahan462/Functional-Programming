package T9
class Rational {
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

  def neg : Unit = {
    val neg_ob = new Rational(-this.numerator, this.denominator)
    println(neg_ob.numerator + "/" + neg_ob.denominator)
  }

  def -(that: Rational): Rational = {
    val commonDenominator = this.denominator * that.denominator
    val newNumerator = (this.numerator * that.denominator) - (that.numerator * this.denominator)
    new Rational(newNumerator, commonDenominator)
  }

  def getNumerator(): String = {
    return this.numerator.toString
  }

  def getDenominator(): String = {
    return this.denominator.toString
  }

}

object firstq {
  def main(args: Array[String]): Unit = {
    val x = new Rational(5, 10);
    x.neg

    val y = new Rational(5, 0);

    val z = new Rational(1, 2);
    z.neg
  }
}
