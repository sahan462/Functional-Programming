package T6
import scala.io.StdIn;
object caesar_cipher {

  val alphabet = "abcdefghijklmnopqrstuvwxyz";

  def encrypt(text: String, shift: Int): String = {

    var encrypted_string = ""
    for(letter<-text){
      if(!letter.isLetter){
        encrypted_string = encrypted_string + letter;
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
      if (!letter.isLetter) {
        decrypted_string = decrypted_string + ' ';
      } else {
        var index = alphabet.indexOf(letter.toLower);
        var new_index = (index + shift) % 26;
        if (letter.isUpper) {
          decrypted_string = decrypted_string + alphabet(new_index).toUpper;
        } else {
          decrypted_string = decrypted_string + alphabet(new_index);
        }

      }
    }
    return decrypted_string;

  }

  def cipher(text:String, shift: Int)(func:(String,Int) => String): Unit = {
    println("Before Translate: " + text);
    println("After Translate: "+ func(text,shift));

  }


  def main(args: Array[String]): Unit = {

    //str1 = THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
    //str2 = QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD 3shifts

    print("Enter Text: ");
    var x = StdIn.readLine();

    print("Enter shift: ");
    var shift = StdIn.readLine().toInt;

    print("Encrypt(1) or Decrypt(2): ");
    var choice = StdIn.readLine();
    if(choice == "1"){
      cipher(x,shift)(encrypt);
    }else{
      cipher(x,shift)(decrypt);
    }

  }
}
