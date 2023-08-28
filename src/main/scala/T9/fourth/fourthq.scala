package T9.fourth

class Bank(accounts: List[Account]) {
  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(account => account.balance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.balance).sum
  }

  def applyInterestToAccounts: List[Account] = {
    for (account <- accounts) {
      if (account.balance > 0) {
        account.deposit(account.balance * 0.05) // Deposit interest of 5% for positive balances
      } else {
        account.deposit(account.balance * 0.01) // Overdraft interest of 1% for negative balances
      }
    }
    accounts
  }
}

class Account(nic: String, val accId: Int, var balance: Double = 0.0) {

  def deposit(amount: Double): Unit = {
    this.balance = this.balance + amount
  }

  def withdraw(amount: Double): Unit = {
    this.balance = this.balance - amount
  }

  def transfer(account: Account, amount: Double): Unit = {
    if (this.balance < amount) {
      println("\n" + "Insufficient Balance!!")
    } else {
      println("This account current balance: " + this.balance)
      println("Given account current balance: " + account.balance)

      this.withdraw(amount)
      account.deposit(amount)

      println("This account updated balance: " + this.balance)
      println("Given account updated balance: " + account.balance)
    }
  }

  def getNIC(): String = {
    return this.nic
  }

  def getBalance(): Double = {
    return this.balance
  }
}

object fourthq {
  def main(args: Array[String]): Unit = {

    var account1 = new Account("200130003276", 1, 1000.0)
    var account2 = new Account("200130003277", 2, -500.0)
    var account3 = new Account("200130003278", 3, 200.0)
    var account4 = new Account("200130003279", 4, -100.0)

    val accounts = List(account1, account2, account3, account4);
    val bank = new Bank(accounts)

    val negativeBalanceAccounts = bank.accountsWithNegativeBalances
    println("Accounts with negative balances:")
    negativeBalanceAccounts.foreach(account => println(s"Account ${account.getNIC()}: ${account.getBalance()}"))

    val totalBalances = bank.totalBalance
    println(s"Total balance of all accounts: $totalBalances")

    val updatedAccounts = bank.applyInterestToAccounts
    println("Updated account balances after applying interest:")
    updatedAccounts.foreach(account => println(s"Account ${account.getNIC()}: ${account.getBalance()}"))
  }
}
