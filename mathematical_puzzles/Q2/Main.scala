val START:Integer = 1000
val END:Integer = 9999

// FIXME:END指定するならどこでやろう
val answer  = Iterator.from(START, 1).filter {
  i=> isSameReverseNumber(Integer.toString(i))
}.next()
println(answer)

// 並んでいる数字の各桁の間に四則演算の演算子を入れて計算する（いれなくてもよいが、最低でも一つ入れる）
def calcNumber(base:Integer): Integer = {
  // 並んでいる数字の各桁の間に四則演算の演算子を入れる

  // 計算する
  base
}

def isSameReverseNumber(base:String): Boolean = {
  val reverse:String  =base.reverse
  base == reverse
}
