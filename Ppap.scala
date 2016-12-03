object Main extends App{
  import scala.util.Random
  
  def ppap(pp: List[String] = Nil): Unit = pp match {
    case "pen" :: "pineapple" :: "apple" :: "pen" :: _ => println(pp.reverse.mkString + " Ah-! Pen Pineapple Apple Pen")
    case _ => ppap((if(Random.nextBoolean) "Pen" else if(Random.nextBoolean) "Pineapple" else "apple") :: pp)
  }
  ppap()
}

