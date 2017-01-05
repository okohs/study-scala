object Main extends App {
  val answer = Iterator.from(10, 1).filter { i =>
    isPalindrome(Integer.toString(i)) &&
      isPalindrome(Integer.toOctalString(i)) &&
      isPalindrome(Integer.toBinaryString(i))
  }.take(1)
  println(answer)

  def isPalindrome(base: String): Boolean = {
    val reverse: String = base.reverse
    base == reverse
  }
}
