object InterestCalculator {

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one deposit amount as input.")
    } else {
      val deposit = args(0).toDouble


      val interestRate1 = (amount: Double) => if (amount <= 20000) amount * 0.02 else 0.0
      val interestRate2 = (amount: Double) => if (amount > 20000 && amount <= 200000) amount * 0.04 else 0.0
      val interestRate3 = (amount: Double) => if (amount > 200000 && amount <= 2000000) amount * 0.035 else 0.0
      val interestRate4 = (amount: Double) => if (amount > 2000000) amount * 0.065 else 0.0


      val interest = interestRate1(deposit) + interestRate2(deposit) + interestRate3(deposit) + interestRate4(deposit)

      println(s"The interest earned on Rs. $deposit is Rs. $interest")
    }
  }

}
