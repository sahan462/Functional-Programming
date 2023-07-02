package T4

object firstq {

  def calcInterest(amount:Double): Double = {
    if(amount < 20000){
      return amount * 2/100.0;
    }else if(amount < 200000){
      return amount * 4/100.0;
    }else if(amount < 2000000){
      return amount * 3.5/100;
    }else{
      return amount * 6.5/100;
    }
  }

  def main(args: Array[String]): Unit = {
    println(calcInterest(50000));
  }

}
