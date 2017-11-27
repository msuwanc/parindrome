object Main extends App {
  val parindrome: Parindrome = new Parindrome
  val parindrome2: Parindrome2 = new Parindrome2

  println(parindrome.isParindrome("madam"))

  println(parindrome.isParindrome("maytee"))

  println(parindrome.isParindrome("nurses run"))

  println(parindrome.isParindrome("This is not a parindrome"))

  println(parindrome.isParindrome("racecar"))

  println(parindrome2.isParindrome2("madam"))

  println(parindrome2.isParindrome2("maytee"))

  println(parindrome2.isParindrome2("nurses run"))

  println(parindrome2.isParindrome2("This is not a parindrome"))

  println(parindrome2.isParindrome2("racecar"))
}