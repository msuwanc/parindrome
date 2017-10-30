object Main extends App {
  val parindrome: Parindrome = new Parindrome

  println(parindrome.isParindrome("madam"))

  println(parindrome.isParindrome("maytee"))

  println(parindrome.isParindrome("nurses run"))

  println(parindrome.isParindrome("This is not a parindrome"))

  println(parindrome.isParindrome("racecar"))
}