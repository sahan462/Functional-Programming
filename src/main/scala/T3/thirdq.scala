package T3

object thirdq {

  def CalMean(num1 : Int, num2 : Int): Float = BigDecimal((num1+num2)/2.0).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat


  def main(args: Array[String]): Unit = {

    print(CalMean(10,15));

  }

}
