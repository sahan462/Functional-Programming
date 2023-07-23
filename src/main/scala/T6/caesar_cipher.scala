package T6
import scala.io.StdIn;
object caesar_cipher {

  val alphabet = "abcdefghijklmnopqrstuvwxyz";

  def encrypt(text: String, shift: Int): String = {
    var new_string = ""
    for(letter<-text){
      var index = alphabet.indexOf(letter);
      var new_index = (shift+index) % 26;
      new_string = new_string + alphabet(new_index);
    }
    return new_string;
  }

  def decrypt(text: String, shift: Int): Unit = {

  }


  def main(args: Array[String]): Unit = {
    print("Enter Text: ");
    var x = StdIn.readLine();
    println(encrypt(x,2));
    //decrypt(x,2);
  }
}
