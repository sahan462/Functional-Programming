package T9
class Account(nic:String, val accId: Int, var balance: Double = 0.0){

  def deposit(amount: Double): Unit = {
    this.balance = this.balance + amount
  }

  def withdraw(amount:Double) : Unit = {
    this.balance = this.balance - amount
  }


  def transfer(account: Account, amount:Double) : Unit = {
    if(this.balance < amount){
      println("\n"+"Insufficient Balance!!")
    }else{
      println("This account current balance: " + this.balance)
      println("Given account current balance: " + account.balance)

      this.withdraw(amount)
      account.deposit(amount)

      println("This account updated balance: " + this.balance)
      println("Given account updated balance: " + account.balance)
    }
  }
}


object thirdq {

  def main(args: Array[String]): Unit = {

    val account_1 = new Account("2000130003276", 0x1)
    account_1.deposit(5000)

    val account_2 = new Account("2000030001346", 0x2)
    val account_3 = new Account("199930001594", 0x3)

    account_1.transfer(account_2,2000);
    account_1.transfer(account_3, 5000);
  }
}
