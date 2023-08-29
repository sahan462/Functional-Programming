package T10

object firstq {

  def calculateAverage(temperatureList: List[Int]): Unit = {

    val fahrenheitList = temperatureList.map(element => element * (9 / 5.0) + 32);
    val average = fahrenheitList.reduce((x, y) => x + y) / fahrenheitList.length;
    print("Average Fahrenheit temperature: " + average);
  }

  def main(args: Array[String]): Unit = {

    val celciusList = List(0, 10, 20, 30);
    calculateAverage(celciusList);

  }

}
