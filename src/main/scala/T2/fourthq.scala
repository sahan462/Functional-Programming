package T2
import scala.math.abs
object fourthq {

  def main(args: Array[String]): Unit = {
    getBestTicketPrice()
  }

  def getBestTicketPrice(): Unit = {
    var i : Int = 0;

    while(i < 50){
      println(i," ",getProfit(i))
      i = i + 5
    }
  }

  def getProfit(price : Double): List[Double] = {

    val basePrice: Double = 15
    val baseAttendance : Int = 120
    var attendance : Int = 0;
    var additional_amount : Int = 0
    val rate : Int = 20/5
    var total_revenue_1 : Double = 0
    var total_revenue_2 : Double = 0
    var profit_1 : Double = 0;

    additional_amount = abs(basePrice - price).toInt
    attendance = additional_amount * rate

    if(price < basePrice){

      total_revenue_1 = price * (baseAttendance + attendance)
      profit_1 = total_revenue_1 - (500 + (baseAttendance + attendance) * 3)

      val profits : List[Double] = List(profit_1)
      return profits
    }else{
      var profit_2 : Double = 0

      total_revenue_1 = price * (baseAttendance - attendance)
      total_revenue_2 = price * (baseAttendance + attendance)

      profit_1 = total_revenue_1 - (500 + (baseAttendance - attendance) * 3)
      profit_2 = total_revenue_2 - (500 + (baseAttendance + attendance) * 3)


      val profits: List[Double] = List(profit_1,profit_2)
      return profits
    }
  }
}
