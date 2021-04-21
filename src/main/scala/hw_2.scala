object hw_2 {

  def sumOfDivBy3Or(iFrom: Int, iTo: Int): Long = {
    var summa = 0
    for (i <- iFrom to iTo) {
      if (i % 3 == 0 || i % 5 == 0)
      {
        summa = summa + i
      }

    }
    summa.toLong
  }


  def main(args: Array[String]): Unit = {
    print(sumOfDivBy3Or(3,9))

  }
}
