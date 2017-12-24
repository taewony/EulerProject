object Euler006 extends EulerApp {
  val range = 1 to 100
  val sum = range.sum
  val sumsq = range.foldLeft(0)((s, a) => (s + a*a))
  def answer = sum * sum - sumsq
}
