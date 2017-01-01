import scala.util.Random
import com.typesafe.emoji._

class Ppap{
  def ppap(pp: List[String] = Nil): Unit = pp match {
    case "apple" :: "pen" :: "pineapple" :: "pen" :: _ =>
      println(pp.reverse.mkString(" ") + " Ah-!")
      print(Emoji(0x1f58a))
      print(Emoji(0x1f34d))
      print(Emoji(0x1f34e))
      print(Emoji(0x1f58a))
    case _ => ppap((if(Random.nextBoolean) "pen" else if(Random.nextBoolean) "pineapple" else "apple") :: pp)
  }
  ppap()
}
