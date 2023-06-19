package T2
import scala.math.abs
object fourthq {

  def main(args: Array[String]): Unit = {
//    print("Enter Ticket Price: ")
//    val price: Int = scala.io.StdIn.readInt()
//    print(price)
//    print(getProfit(price))
    getBestTicketPrice()
  }

  def getBestTicketPrice(): Unit = {
    var i : Int = 1;

    while(i < 50){
      println(i," ",getProfit(i))
      i = i + 1
    }
  }

  def getProfit(price : Double): List[Double] = {

    val basePrice: Double = 15
    val baseAttendance : Int = 120
    var attendance : Int = 0;
    var additional_amount : Int = 0
    val rate : Int = 20/5
    var normal_total_revenue : Double = 0
    var abnormal_total_revenue : Double = 0
    var profit_1 : Double = 0;

    additional_amount = abs(basePrice - price).toInt
    attendance = additional_amount * rate

    if(price < basePrice){

      normal_total_revenue = price * (baseAttendance + attendance)
      profit_1 = normal_total_revenue - (500 + (baseAttendance + attendance) * 3)

      val profits : List[Double] = List(profit_1)
      return profits
    }else{
      var profit_2 : Double = 0

      normal_total_revenue = price * (baseAttendance - attendance)
      abnormal_total_revenue = price * (baseAttendance + attendance)

      profit_1 = normal_total_revenue - (500 + (baseAttendance - attendance) * 3)
      profit_2 = abnormal_total_revenue - (500 + (baseAttendance + attendance) * 3)


      val profits: List[Double] = List(profit_1,profit_2)
      return profits
    }
  }
}
