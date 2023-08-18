package T8
import io.StdIn;
object thirdq {

  val toUpper = (letter: String) => letter.toUpperCase()


  val toLower = (letter: String) => letter.toLowerCase()


  val formatNames = (letter: String, Function: (String) => String) => (Function(letter))


//  BENNY
//  NIroshan
//  saman
//  KumarA

  def main(args: Array[String]): Unit = {

    //var names = List("Benny", "Niroshan", "Saman", "Kumara");

    print("Enter Word: ");
    val word = StdIn.readLine();

    var new_word = "";
    var answer = 0;

    for(letter<-word){
      answer = -1
      if(letter.isUpper){


        while(answer != 0 && answer != 1) {

          println("letter :"+ "'"+letter+"'")
          print("convert to lower case? => " + "(Yes - 1, No - 0) :")
          answer = StdIn.readLine().toInt;

          if (answer == 1) {
            new_word = new_word + formatNames(letter.toString, toLower)
          } else if(answer == 0){
            new_word = new_word + letter
          }else{
            println("Incorrect Response => YES - 1, NO - 0")
          }

        }
        println(new_word)

      }else{

        while (answer != 0 && answer != 1) {

          println("letter :" + "'" + letter + "'")
          print("convert to upper case? => " + "(Yes - 1, No - 0) :")
          answer = StdIn.readLine().toInt;

          if (answer == 1) {
            new_word = new_word + formatNames(letter.toString, toUpper)
          } else if (answer == 0) {
            new_word = new_word + letter
          } else {
            println("Incorrect Response => YES - 1, NO - 0")
          }

        }
        println(new_word)

      }
    }
    println("New Word: ", new_word);
    }
}
