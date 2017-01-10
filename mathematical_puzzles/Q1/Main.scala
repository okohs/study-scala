val answer = Iterator.from(10, 1).filter { i =>
  isPalindrome(Integer.toString(i)) &&
    isPalindrome(Integer.toOctalString(i)) &&
    isPalindrome(Integer.toBinaryString(i))
}.next
println(answer)

def isPalindrome(base: String): Boolean = {
  val reverse: String = base.reverse
  base == reverse
}
