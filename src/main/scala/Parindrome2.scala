class Parindrome2 {
  def isParindrome2(s: String): Boolean = {
    val newString: String = s.replace(" ", "").trim

    var firstIndex: Int = 0
    var lastIndex: Int = newString.length - 1

    var result: Boolean = true

    def isCenter(firstIndex: Int, lastIndex: Int): Boolean = {
      if(firstIndex == lastIndex) true
      else if(lastIndex - firstIndex == 1) true
      else false
    }

    while(result && !isCenter(firstIndex, lastIndex)) {
      if(newString.charAt(firstIndex) != newString.charAt(lastIndex)) result = false
      else {
        firstIndex = firstIndex + 1
        lastIndex = lastIndex - 1
      }
    }

    result
  }
}