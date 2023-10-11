package test

object test3 {


  def pattern(n:Int): String = {
    if(n == 1){
      println(n.toString);
      return n.toString;
    }else{
      var str = n.toString + pattern(n-1);
      println(str);
      return str;
    }
  }

  def main(args: Array[String]): Unit = {
    pattern(4);
  }

}
