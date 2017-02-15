/**
 * Evalクラスが使えそう
 */
val START_NUMBER:Int = 1000
val END_NUMBER:Int = 9999

val answer = Iterator.from(START_NUMBER, 1).filter(
  i => (i.toString.reverse == calcNumber(i)) && (i <= END_NUMBER)
).next()
println(answer)

/**
  * 並んでいる数字の各桁の間に四則演算の演算子を入れて計算する
  * いれなくてもよいが、最低でも一つ入れる
  *
  * @param base
  * @return
  */
def calcNumber(base:Int): Int = {
  // 並んでいる数字の各桁の間に四則演算の演算子を入れる
  // 少なくとも１つ四則演算の演算子が入っているかチェックする
  // 計算する
  base
}

def isSameReverseNumber(base:String): Boolean = {
  val reverse:String  =base.reverse
  base == reverse
}
