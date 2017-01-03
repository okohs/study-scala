import scala.util.control.Breaks

var i:Int = 10

while(true){
  val b = new Breaks
  if(isPalindromes(Integer.toString(i)) && isPalindromes(Integer.toOctalString(i)) && isPalindromes(Integer.toBinaryString(i))){
    println(i)
    b.break()
  }else{
    i+=1
  }
}

def isPalindromes(base:String): Boolean = {
  val reverse:String = base.reverse
  base == reverse
}