object Main extends App{
  import scala.util.Random

  def ppap(pp: List[String] = Nil): Unit = pp match {
    // apple->0x1F34D, pen->0x
    // Rubyの場合 PPAP = [pen "\u2712\ufe0f", pineapple "\u{1f34d}\ufe0f", apple"\u{1f34e}\ufe0f"]
    case "apple" :: "pen" :: "pineapple" :: "pen" :: _ => println(pp.reverse.mkString(" ") + " Ah-! pen-pineapple-Apple-pen!")
    case _ => ppap((if(Random.nextBoolean) "pen" else if(Random.nextBoolean) "pineapple" else "apple") :: pp)
  }
  ppap()
}
