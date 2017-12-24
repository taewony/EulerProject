object Euler004 extends EulerApp {
    def answer = {
        def isPalindrome(num: Int) = {
            val numStr = num.toString()
            numStr == numStr.reverse
        }
        val palindromes = for(x <- 100 to 999; y <- x to 999 if(isPalindrome(x*y))) yield (x*y)
        palindromes.max
    }
}