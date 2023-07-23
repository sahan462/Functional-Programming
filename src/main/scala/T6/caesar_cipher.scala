package T6
import scala.io.StdIn;
object caesar_cipher {

  val alphabet = "abcdefghijklmnopqrstuvwxyz";

  def encrypt(text: String, shift: Int): String = {
    var encrypted_string = ""
    for(letter<-text){
      var index = alphabet.indexOf(letter);
      var new_index = (shift+index) % 26;
      encrypted_string = encrypted_string + alphabet(new_index);
    }
    return encrypted_string;
  }

  def decrypt(text: String, shift: Int): String = {
    var decrypted_string = ""
    for (letter <- text) {
      var index = alphabet.indexOf(letter);
      var new_index = (index-shift) % 26;
      decrypted_string = decrypted_string + alphabet(new_index);
    }
    return decrypted_string;
  }


  def main(args: Array[String]): Unit = {
    print("Enter Text: ");
    var x = StdIn.readLine();
    println(encrypt(x,2));
    println(decrypt(x,2));
  }
}
