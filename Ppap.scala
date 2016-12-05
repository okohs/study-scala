object Main extends App{
  import scala.util.Random

  def ppap(pp: List[String] = Nil): Unit = pp match {
    case "pen" :: "pineapple" :: "apple" :: "pen" :: _ => println(pp.reverse.mkString(" ") + " Ah-! pen-pineapple-Apple-pen!")
    case _ => ppap((if(Random.nextBoolean) "pen" else if(Random.nextBoolean) "pineapple" else "apple") :: pp)
  }
  ppap()
}
