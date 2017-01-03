import scala.util.control.Breaks

var i:Int = 10

while(true){
  val b = new Breaks
  val base:String = Integer.toString(i)
  val reverse:String = base.reverse
  if(base == reverse){
    val octalBase:String = Integer.toOctalString(i)
    val octalRebase:String = octalBase.reverse
    if(octalBase == octalRebase){
      val binaryBase:String = Integer.toBinaryString(i)
      val binaryRebase:String = binaryBase.reverse
      if(binaryBase == binaryRebase){
        println(base)
        b.break()
      }
    }
  }else{
    i+=1
  }
}