package T1

object firstq {
  def main(args: Array[String]): Unit = {
    println(areaOfDisk(5, 3.14))
    println(tempConvert(35))
    println(volume(5, 3.14));
    println(wholesaleCost(24.95, 60, 3.00, 0.75, 0.6));
    println(runningTime(8, 4, 7, 3));
  }

  def areaOfDisk(r: Int, p: Double): Double = r * r * p;

  def tempConvert(c: Int): Double = c * 1.8 + 32.00;

  def volume(r: Int, p: Double): Double = 3.0 / 4.0 * p * r * r * r;

  def wholesaleCost(cost: Double, count: Int, del: Double, additional: Double, discount: Double): Double = if (count > 50) cost * discount * count + del + (del + additional) * (count - 50); else cost * discount * count + del;

  def runningTime(easyPace: Int, easyDis: Int, hardPace: Int, hardDis: Int): Int = easyPace * easyDis + hardPace * hardDis;
}
