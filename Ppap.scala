object Main extends App{
  import scala.util.Random
  
  def ppap(pp: List[String] = Nil): Unit = pp match {
    case "ペン" :: "パイナップル" :: "アップル" :: "ペン" :: _ => println(pp.reverse.mkString + "Pen Pineapple Apple Pen")
    case _ => ppap((if(Random.nextBoolean) "ペン" else if(Random.nextBoolean) "パイナップル" else "アップル") :: pp)
  }
  ppap()
}
