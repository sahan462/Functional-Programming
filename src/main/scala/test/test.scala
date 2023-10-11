package test

object test {


  def f(num: Int, arr: List[Int]): List[Int] = {
    var i = 0;
    var return_arr: List[Int] = List()
    while (i < arr.length) {
      var j = 0;
      println(arr(i));
      while (j < num){
        return_arr = arr(i) :: return_arr
        j = j + 1
      }
      i = i + 1
    }
    return return_arr
  }


  def main (args: Array[String]): Unit = {
    print(f(3,List(1,2,3,4,5,6,7,8,9,10)));
  }

}
