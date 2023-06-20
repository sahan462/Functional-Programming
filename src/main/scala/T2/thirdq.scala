package T2

object thirdq {

  def main(args: Array[String]): Unit = {
    print(CalTakeHomeSalary(250, 85, 40, 30,0.12))
  }

  def CalTakeHomeSalary(nw_rate : Int, ot_rate : Int, nwh : Int, otwh : Int,tax:Double): Double = ((nwh * nw_rate + otwh * ot_rate) * (1 - tax)) * 4




}
