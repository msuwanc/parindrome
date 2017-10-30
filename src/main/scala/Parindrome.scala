class Parindrome {
  def isParindrome(s: String): Boolean = {
    val newString: String = s.replace(" ", "")

    var result: Boolean = true

    var firstIndex: Int = 0
    var lastIndex: Int = newString.length - 1

    if(newString.length % 2 == 0){
      while(lastIndex - firstIndex != 1 && result){
        if(newString.charAt(firstIndex) != newString.charAt(lastIndex)){
          result = false
        } else {
          firstIndex = firstIndex + 1
          lastIndex = lastIndex - 1
        }
      }
    } else {
      while(firstIndex != lastIndex && result){
        if(newString.charAt(firstIndex) != newString.charAt(lastIndex)){
          result = false
        } else {
          firstIndex = firstIndex + 1
          lastIndex = lastIndex - 1
        }
      }
    }

    result
  }
}