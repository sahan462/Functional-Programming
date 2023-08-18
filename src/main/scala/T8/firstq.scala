package T8
import io.StdIn
object firstq {


  val calcInterest = (amount:Float)  => {
    var interest = 0.0

    if(amount <= 20000){
      interest = amount * (2.0/100)
    }else if(amount <= 200000){
      interest = amount * (4.0/100)
    }else if(amount <= 2000000){
      interest = amount * (3.5/100)
    }else{
      interest = amount * (6.5/100)
    }
    interest
  }

  def main(args: Array[String]): Unit = {
    print("Enter Amount: ")
    var amount = StdIn.readLine();
    print("Interest :" + calcInterest(amount.toFloat));
  }


}
