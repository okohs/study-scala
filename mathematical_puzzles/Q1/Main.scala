import scala.util.control.Breaks

object Main extends App{
  var i:Int = 10

  while(true){
    if(isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toOctalString(i)) && isPalindrome(Integer.toBinaryString(i))){
      println(i)
      val b = new Breaks
      b.break()
    }else{
      i+=1
    }
  }

  def isPalindrome(base:String): Boolean = {
    val reverse:String = base.reverse
    base == reverse
  }
}
