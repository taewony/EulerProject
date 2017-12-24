/*object Euler005 extends EulerApp {
    def divisibleBy(num: Int) = {
        (20 to 11 by -1).forall(num % _ == 0)
    }
    val natualNums = Iterator.from(1)
    def answer = natualNums.find(divisibleBy).get
}*/

object Euler005 extends EulerApp {
  def answer = (1 to 20).foldLeft(1L)((a,b) => lcm(a,b))

  def primeFactors(num: Long): List[Long] = {
    val exists = (2L to math.sqrt(num).toLong).find(num % _ == 0)
    exists match {
      case Some(d) => d :: primeFactors(num/d)
      case None => List(num)
    }
  }
  
  def gcf(a: Long, b: Long): Long = {
    if (b == 0) a
    else gcf(b, a % b)
  }
  
  def lcm(a: Long, b: Long) = {
    (a * b) / gcf(a,b)
  }
}