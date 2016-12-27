for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000) if (a * a == b * b + c * c) {
  println("a=" + a + ", b=" + b + ", c=" + c)
}