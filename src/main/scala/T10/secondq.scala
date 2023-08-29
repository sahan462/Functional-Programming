package T10

object secondq {

  def countLetterOccurrences(nameList: List[String]): Unit = {

    val nameLengthList = nameList.map(element => element.length);
    val letterCount = nameLengthList.reduce((x, y) => x + y) ;
    print("Total count of letter occurrences: " + letterCount);

  }

  def main(args: Array[String]): Unit = {

    val nameList = List("apple", "banana", "cherry", "date");
    countLetterOccurrences(nameList);

  }

}
