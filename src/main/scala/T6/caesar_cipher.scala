package T6
import scala.io.StdIn;
object caesar_cipher {

  val alphabet = "abcdefghijklmnopqrstuvwxyz";

  def encrypt(text: String, shift: Int): String = {
    var encrypted_string = ""
    for(letter<-text){
      if(letter == ' '){
        encrypted_string = encrypted_string + ' ';
      }else{
        var index = alphabet.indexOf(letter.toLower);
        var new_index = (index - shift) % 26;
        if (new_index < 0) {
          new_index = new_index + 26;
        }
        if(letter.isUpper){
          encrypted_string = encrypted_string + alphabet(new_index).toUpper;
        }else{
          encrypted_string = encrypted_string + alphabet(new_index);
        }

      }
    }
    return encrypted_string;
  }

  def decrypt(text: String, shift: Int): String = {
    var decrypted_string = ""
    for (letter <- text) {
      var index = alphabet.indexOf(letter);
      var new_index = (index+shift) % 26;
      decrypted_string = decrypted_string + alphabet(new_index);
    }
    return decrypted_string;
  }


  def main(args: Array[String]): Unit = {

    print("Enter Text: ");
    var x = StdIn.readLine();

    print("Enter shift: ");
    var shift = StdIn.readLine().toInt;

    print("Encrypt(1) or Decrypt(2): ");
    var choice = StdIn.readLine();
    if(choice == "1"){
      println(encrypt(x,shift));
    }else{
      println(decrypt(x,shift));
    }

  }
}
