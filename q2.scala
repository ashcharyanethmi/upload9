object NumberClassifier {

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer as input.")
    } else {
      val input = args(0).toInt


      val isEven = (n: Int) => n % 2 == 0
      val isOdd = (n: Int) => n % 2 != 0

      
      input match {
        case n if n <= 0 =>
          println("Negative/Zero is input")
        case n if isEven(n) =>
          println("Even number is given")
        case n if isOdd(n) =>
          println("Odd number is given")
      }
    }
  }

}
