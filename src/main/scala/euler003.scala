object Euler003 extends EulerApp {
  def answer = {
    def factors(num: Long): List[Long] = {
      val exists = (2L to math.sqrt(num).toLong).find(num%_ == 0)
      exists match {
        case Some(d) => d :: factors(num/d)
        case None => List(num)
      }
    }
    factors(600851475143L).last
  }
}
