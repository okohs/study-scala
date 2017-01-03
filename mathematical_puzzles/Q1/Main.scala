import scala.util.control.Breaks

object Main extends App{
  var i:Int = 10

  while(true){
    if(isPalindromes(Integer.toString(i)) && isPalindromes(Integer.toOctalString(i)) && isPalindromes(Integer.toBinaryString(i))){
      println(i)
      val b = new Breaks
      b.break()
    }else{
      i+=1
    }
  }

  def isPalindromes(base:String): Boolean = {
    val reverse:String = base.reverse
    base == reverse
  }
}
